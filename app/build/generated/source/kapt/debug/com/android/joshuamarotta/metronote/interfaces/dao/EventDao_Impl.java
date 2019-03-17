package com.android.joshuamarotta.metronote.interfaces.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.android.joshuamarotta.metronote.converters.Converters;
import com.android.joshuamarotta.metronote.models.EventRoomModel;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class EventDao_Impl implements EventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfEventRoomModel;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfEventRoomModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public EventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEventRoomModel = new EntityInsertionAdapter<EventRoomModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `event_table`(`eventId`,`title`,`description`,`location`,`eventType`,`dateTime`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EventRoomModel value) {
        stmt.bindLong(1, value.getEventId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLocation());
        }
        if (value.getEventType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEventType());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDateTime());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
      }
    };
    this.__deletionAdapterOfEventRoomModel = new EntityDeletionOrUpdateAdapter<EventRoomModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `event_table` WHERE `eventId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EventRoomModel value) {
        stmt.bindLong(1, value.getEventId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM event_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(EventRoomModel eventRoomModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfEventRoomModel.insert(eventRoomModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(EventRoomModel eventRoomModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfEventRoomModel.handle(eventRoomModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<EventRoomModel>> getAlphabetizedEvents() {
    final String _sql = "SELECT * from event_table ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<EventRoomModel>>() {
      private Observer _observer;

      @Override
      protected List<EventRoomModel> compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final List<EventRoomModel> _result = new ArrayList<EventRoomModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EventRoomModel _item;
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _item = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<EventRoomModel>> getDateTimeSortedEvents() {
    final String _sql = "SELECT * FROM event_table ORDER BY dateTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<EventRoomModel>>() {
      private Observer _observer;

      @Override
      protected List<EventRoomModel> compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final List<EventRoomModel> _result = new ArrayList<EventRoomModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EventRoomModel _item;
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _item = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<EventRoomModel>> getDateTimeSortedPerformances() {
    final String _sql = "SELECT * FROM event_table WHERE eventType = 'Performance' ORDER BY dateTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<EventRoomModel>>() {
      private Observer _observer;

      @Override
      protected List<EventRoomModel> compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final List<EventRoomModel> _result = new ArrayList<EventRoomModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EventRoomModel _item;
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _item = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<EventRoomModel>> getDateTimeSortedPractices() {
    final String _sql = "SELECT * FROM event_table WHERE eventType = 'Practice' ORDER BY dateTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<EventRoomModel>>() {
      private Observer _observer;

      @Override
      protected List<EventRoomModel> compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final List<EventRoomModel> _result = new ArrayList<EventRoomModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EventRoomModel _item;
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _item = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<EventRoomModel> getEvent(int eventId) {
    final String _sql = "SELECT * FROM event_table WHERE eventId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, eventId);
    return new ComputableLiveData<EventRoomModel>() {
      private Observer _observer;

      @Override
      protected EventRoomModel compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final EventRoomModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _result = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<EventRoomModel> getEvent() {
    final String _sql = "SELECT * FROM event_table WHERE eventId = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<EventRoomModel>() {
      private Observer _observer;

      @Override
      protected EventRoomModel compute() {
        if (_observer == null) {
          _observer = new Observer("event_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEventId = _cursor.getColumnIndexOrThrow("eventId");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
          final int _cursorIndexOfEventType = _cursor.getColumnIndexOrThrow("eventType");
          final int _cursorIndexOfDateTime = _cursor.getColumnIndexOrThrow("dateTime");
          final EventRoomModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpEventId;
            _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpEventType;
            _tmpEventType = _cursor.getString(_cursorIndexOfEventType);
            final Date _tmpDateTime;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateTime);
            }
            _tmpDateTime = __converters.fromTimestamp(_tmp);
            _result = new EventRoomModel(_tmpEventId,_tmpTitle,_tmpDescription,_tmpLocation,_tmpEventType,_tmpDateTime);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
