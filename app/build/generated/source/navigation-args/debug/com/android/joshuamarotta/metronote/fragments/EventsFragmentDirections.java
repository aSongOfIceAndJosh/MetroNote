package com.android.joshuamarotta.metronote.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EventsFragmentDirections {
  @NonNull
  public static ActionEventsFragmentToManageEventFragment actionEventsFragmentToManageEventFragment() {
    return new ActionEventsFragmentToManageEventFragment();
  }

  public static class ActionEventsFragmentToManageEventFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionEventsFragmentToManageEventFragment() {
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      return __result;
    }

    @Override
    public int getActionId() {
      return com.android.joshuamarotta.metronote.R.id.action_eventsFragment_to_manageEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionEventsFragmentToManageEventFragment that = (ActionEventsFragmentToManageEventFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionEventsFragmentToManageEventFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
