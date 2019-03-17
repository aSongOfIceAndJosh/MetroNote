package com.android.joshuamarotta.metronote.roomdatabase;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.android.joshuamarotta.metronote.interfaces.dao.EventDao;
import com.android.joshuamarotta.metronote.interfaces.dao.EventDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class EventRoomDatabase_Impl extends EventRoomDatabase {
  private volatile EventDao _eventDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `event_table` (`eventId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `location` TEXT NOT NULL, `eventType` TEXT NOT NULL, `dateTime` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"113eb72100d41a58da0a33e89c2bd02b\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `event_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEventTable = new HashMap<String, TableInfo.Column>(6);
        _columnsEventTable.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 1));
        _columnsEventTable.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsEventTable.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsEventTable.put("location", new TableInfo.Column("location", "TEXT", true, 0));
        _columnsEventTable.put("eventType", new TableInfo.Column("eventType", "TEXT", true, 0));
        _columnsEventTable.put("dateTime", new TableInfo.Column("dateTime", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEventTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEventTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEventTable = new TableInfo("event_table", _columnsEventTable, _foreignKeysEventTable, _indicesEventTable);
        final TableInfo _existingEventTable = TableInfo.read(_db, "event_table");
        if (! _infoEventTable.equals(_existingEventTable)) {
          throw new IllegalStateException("Migration didn't properly handle event_table(com.android.joshuamarotta.metronote.models.EventRoomModel).\n"
                  + " Expected:\n" + _infoEventTable + "\n"
                  + " Found:\n" + _existingEventTable);
        }
      }
    }, "113eb72100d41a58da0a33e89c2bd02b", "33c149c8df39f374dc7f0a259eb12cce");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "event_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `event_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public EventDao eventDao() {
    if (_eventDao != null) {
      return _eventDao;
    } else {
      synchronized(this) {
        if(_eventDao == null) {
          _eventDao = new EventDao_Impl(this);
        }
        return _eventDao;
      }
    }
  }
}
