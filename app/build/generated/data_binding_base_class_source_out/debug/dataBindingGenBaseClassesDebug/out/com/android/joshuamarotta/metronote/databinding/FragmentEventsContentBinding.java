package com.android.joshuamarotta.metronote.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.joshuamarotta.metronote.viewmodels.EventViewModel;

public abstract class FragmentEventsContentBinding extends ViewDataBinding {
  @NonNull
  public final TextView eventsFragmentNoEventsBookedTextview;

  @NonNull
  public final RecyclerView fragmentEventsContentRecyclerview;

  @Bindable
  protected EventViewModel mViewmodel;

  protected FragmentEventsContentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView eventsFragmentNoEventsBookedTextview,
      RecyclerView fragmentEventsContentRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.eventsFragmentNoEventsBookedTextview = eventsFragmentNoEventsBookedTextview;
    this.fragmentEventsContentRecyclerview = fragmentEventsContentRecyclerview;
  }

  public abstract void setViewmodel(@Nullable EventViewModel viewmodel);

  @Nullable
  public EventViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentEventsContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEventsContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEventsContentBinding>inflate(inflater, com.android.joshuamarotta.metronote.R.layout.fragment_events_content, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEventsContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentEventsContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentEventsContentBinding>inflate(inflater, com.android.joshuamarotta.metronote.R.layout.fragment_events_content, null, false, component);
  }

  public static FragmentEventsContentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentEventsContentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentEventsContentBinding)bind(component, view, com.android.joshuamarotta.metronote.R.layout.fragment_events_content);
  }
}
