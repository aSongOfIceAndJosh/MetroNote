package com.android.joshuamarotta.metronote.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProfileFragmentDirections {
  @NonNull
  public static ActionProfileFragmentToEventsFragment actionProfileFragmentToEventsFragment() {
    return new ActionProfileFragmentToEventsFragment();
  }

  public static class ActionProfileFragmentToEventsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionProfileFragmentToEventsFragment() {
    }

    @NonNull
    public ActionProfileFragmentToEventsFragment setViewPagerTabToLaunch(int viewPagerTabToLaunch) {
      this.arguments.put("viewPagerTabToLaunch", viewPagerTabToLaunch);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("viewPagerTabToLaunch")) {
        int viewPagerTabToLaunch = (int) arguments.get("viewPagerTabToLaunch");
        __result.putInt("viewPagerTabToLaunch", viewPagerTabToLaunch);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return com.android.joshuamarotta.metronote.R.id.action_profileFragment_to_eventsFragment;
    }

    @SuppressWarnings("unchecked")
    public int getViewPagerTabToLaunch() {
      return (int) arguments.get("viewPagerTabToLaunch");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionProfileFragmentToEventsFragment that = (ActionProfileFragmentToEventsFragment) object;
      if (arguments.containsKey("viewPagerTabToLaunch") != that.arguments.containsKey("viewPagerTabToLaunch")) {
        return false;
      }
      if (getViewPagerTabToLaunch() != that.getViewPagerTabToLaunch()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getViewPagerTabToLaunch();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionProfileFragmentToEventsFragment(actionId=" + getActionId() + "){"
          + "viewPagerTabToLaunch=" + getViewPagerTabToLaunch()
          + "}";
    }
  }
}
