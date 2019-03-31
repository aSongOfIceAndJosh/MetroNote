package com.android.joshuamarotta.metronote.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020#H\u0016J\u0012\u00104\u001a\u00020#2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020#H\u0016J\u001a\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010:\u001a\u00020#H\u0002J\u0010\u0010;\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010<\u001a\u00020#H\u0002J\b\u0010=\u001a\u00020#H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u001c0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/CreateEventFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/joshuamarotta/metronote/interfaces/OnReselectedDelegate;", "Lcom/android/joshuamarotta/metronote/interfaces/OnBackPressedListener;", "()V", "createEventCallback", "Lcom/android/joshuamarotta/metronote/fragments/CreateEventFragment$CreateEventCallback;", "date", "", "dateView", "Landroid/widget/TextView;", "day", "", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "eventViewModel", "Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "getEventViewModel", "()Lcom/android/joshuamarotta/metronote/viewmodels/EventViewModel;", "eventViewModel$delegate", "Lkotlin/Lazy;", "hour", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "kotlin.jvm.PlatformType", "minute", "month", "now", "Ljava/util/Calendar;", "time", "timeView", "year", "computeHour", "xMinute", "dismissSoftKeyboard", "", "evaluateAddClick", "formatDateTime", "Ljava/util/Date;", "initDialogDateTime", "launchDatePicker", "launchTimePicker", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onReselected", "onViewCreated", "view", "pushEventToDatabase", "setCreateEventActivityCallback", "setupActionBar", "setupDialogLauncher", "CreateEventCallback", "app_debug"})
public final class CreateEventFragment extends android.support.v4.app.Fragment implements com.android.joshuamarotta.metronote.interfaces.OnReselectedDelegate, com.android.joshuamarotta.metronote.interfaces.OnBackPressedListener {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final com.google.firebase.auth.FirebaseAuth mAuth = null;
    private final java.util.Calendar now = null;
    private java.lang.String date;
    private java.lang.String time;
    private android.widget.TextView timeView;
    private android.widget.TextView dateView;
    private final kotlin.Lazy eventViewModel$delegate = null;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private com.android.joshuamarotta.metronote.fragments.CreateEventFragment.CreateEventCallback createEventCallback;
    private java.util.HashMap _$_findViewCache;
    
    private final com.android.joshuamarotta.metronote.viewmodels.EventViewModel getEventViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupActionBar() {
    }
    
    @java.lang.Override()
    public void onReselected() {
    }
    
    private final void initDialogDateTime() {
    }
    
    private final void setupDialogLauncher() {
    }
    
    private final void evaluateAddClick() {
    }
    
    private final void pushEventToDatabase() {
    }
    
    private final java.util.Date formatDateTime() {
        return null;
    }
    
    private final void launchDatePicker() {
    }
    
    private final void launchTimePicker() {
    }
    
    private final java.lang.String computeHour(int hour, int xMinute) {
        return null;
    }
    
    private final void dismissSoftKeyboard() {
    }
    
    public final void setCreateEventActivityCallback(@org.jetbrains.annotations.Nullable()
    com.android.joshuamarotta.metronote.fragments.CreateEventFragment.CreateEventCallback createEventCallback) {
    }
    
    public CreateEventFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/android/joshuamarotta/metronote/fragments/CreateEventFragment$CreateEventCallback;", "", "displayFloatingActionButton", "", "app_debug"})
    public static abstract interface CreateEventCallback {
        
        public abstract void displayFloatingActionButton();
    }
}