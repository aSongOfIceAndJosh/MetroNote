package com.android.joshuamarotta.metronote.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  @NonNull
  public static ActionHomeFragmentToCreateEventFragment actionHomeFragmentToCreateEventFragment() {
    return new ActionHomeFragmentToCreateEventFragment();
  }

  public static class ActionHomeFragmentToCreateEventFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionHomeFragmentToCreateEventFragment() {
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
      return com.android.joshuamarotta.metronote.R.id.action_homeFragment_to_createEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToCreateEventFragment that = (ActionHomeFragmentToCreateEventFragment) object;
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
      return "ActionHomeFragmentToCreateEventFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
