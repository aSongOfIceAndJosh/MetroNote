package com.android.joshuamarotta.metronote.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EventsFragmentArgs {
  private final HashMap arguments = new HashMap();

  private EventsFragmentArgs() {
  }

  private EventsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EventsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EventsFragmentArgs __result = new EventsFragmentArgs();
    bundle.setClassLoader(EventsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("viewPagerTabToLaunch")) {
      int viewPagerTabToLaunch;
      viewPagerTabToLaunch = bundle.getInt("viewPagerTabToLaunch");
      __result.arguments.put("viewPagerTabToLaunch", viewPagerTabToLaunch);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getViewPagerTabToLaunch() {
    return (int) arguments.get("viewPagerTabToLaunch");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("viewPagerTabToLaunch")) {
      int viewPagerTabToLaunch = (int) arguments.get("viewPagerTabToLaunch");
      __result.putInt("viewPagerTabToLaunch", viewPagerTabToLaunch);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EventsFragmentArgs that = (EventsFragmentArgs) object;
    if (arguments.containsKey("viewPagerTabToLaunch") != that.arguments.containsKey("viewPagerTabToLaunch")) {
      return false;
    }
    if (getViewPagerTabToLaunch() != that.getViewPagerTabToLaunch()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + getViewPagerTabToLaunch();
    return result;
  }

  @Override
  public String toString() {
    return "EventsFragmentArgs{"
        + "viewPagerTabToLaunch=" + getViewPagerTabToLaunch()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(EventsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public EventsFragmentArgs build() {
      EventsFragmentArgs result = new EventsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setViewPagerTabToLaunch(int viewPagerTabToLaunch) {
      this.arguments.put("viewPagerTabToLaunch", viewPagerTabToLaunch);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getViewPagerTabToLaunch() {
      return (int) arguments.get("viewPagerTabToLaunch");
    }
  }
}
