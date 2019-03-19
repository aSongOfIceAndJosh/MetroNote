package com.android.joshuamarotta.metronote.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010+\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0002J\b\u00102\u001a\u00020.H\u0002J\b\u00103\u001a\u00020.H\u0002J\b\u00104\u001a\u00020.H\u0003J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0016J\u0012\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020;2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u0004\u0018\u00010\u0007J\b\u0010C\u001a\u00020.H\u0002J\b\u0010D\u001a\u00020;H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0017\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001a\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001b\u0010\fR\u001b\u0010\u001d\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001e\u0010\u0012R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000e\u001a\u0004\b&\u0010#R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b)\u0010#\u00a8\u0006E"}, d2 = {"Lcom/android/joshuamarotta/metronote/activities/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/android/joshuamarotta/metronote/fragments/CreateEventFragment$CreateEventCallback;", "()V", "currentController", "Landroidx/navigation/NavController;", "floatingActionButton", "Lio/github/yavski/fabspeeddial/FabSpeedDial;", "menu", "Landroid/view/Menu;", "navDashboardController", "getNavDashboardController", "()Landroidx/navigation/NavController;", "navDashboardController$delegate", "Lkotlin/Lazy;", "navDashboardFragment", "Landroid/support/v4/app/Fragment;", "getNavDashboardFragment", "()Landroid/support/v4/app/Fragment;", "navDashboardFragment$delegate", "navHomeController", "getNavHomeController", "navHomeController$delegate", "navHomeFragment", "getNavHomeFragment", "navHomeFragment$delegate", "navNotificationController", "getNavNotificationController", "navNotificationController$delegate", "navNotificationFragment", "getNavNotificationFragment", "navNotificationFragment$delegate", "sectionDashboardWrapper", "Landroid/widget/FrameLayout;", "getSectionDashboardWrapper", "()Landroid/widget/FrameLayout;", "sectionDashboardWrapper$delegate", "sectionHomeWrapper", "getSectionHomeWrapper", "sectionHomeWrapper$delegate", "sectionNotificationsWrapper", "getSectionNotificationsWrapper", "sectionNotificationsWrapper$delegate", "closeAndHideFloatingActionButton", "closeAndShowFloatingActionButton", "displayFloatingActionButton", "", "handleExploreNavigationSelected", "handleHomeNavigationSelected", "handleProfileNavigationSelected", "hideRootMenuItems", "initAndHandleFloatingActionButton", "initBottomNavigationView", "navigateUp", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onReselected", "itemId", "", "showFloatingActionButton", "showRootMenuItems", "transactCreateEventFragment", "app_debug"})
public final class HomeActivity extends android.support.v7.app.AppCompatActivity implements com.android.joshuamarotta.metronote.fragments.CreateEventFragment.CreateEventCallback {
    private android.view.Menu menu;
    private final kotlin.Lazy sectionHomeWrapper$delegate = null;
    private final kotlin.Lazy sectionDashboardWrapper$delegate = null;
    private final kotlin.Lazy sectionNotificationsWrapper$delegate = null;
    private final kotlin.Lazy navHomeController$delegate = null;
    private final kotlin.Lazy navHomeFragment$delegate = null;
    private final kotlin.Lazy navDashboardController$delegate = null;
    private final kotlin.Lazy navDashboardFragment$delegate = null;
    private final kotlin.Lazy navNotificationController$delegate = null;
    private final kotlin.Lazy navNotificationFragment$delegate = null;
    private androidx.navigation.NavController currentController;
    private io.github.yavski.fabspeeddial.FabSpeedDial floatingActionButton;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.FrameLayout getSectionHomeWrapper() {
        return null;
    }
    
    private final android.widget.FrameLayout getSectionDashboardWrapper() {
        return null;
    }
    
    private final android.widget.FrameLayout getSectionNotificationsWrapper() {
        return null;
    }
    
    private final androidx.navigation.NavController getNavHomeController() {
        return null;
    }
    
    private final android.support.v4.app.Fragment getNavHomeFragment() {
        return null;
    }
    
    private final androidx.navigation.NavController getNavDashboardController() {
        return null;
    }
    
    private final android.support.v4.app.Fragment getNavDashboardFragment() {
        return null;
    }
    
    private final androidx.navigation.NavController getNavNotificationController() {
        return null;
    }
    
    private final android.support.v4.app.Fragment getNavNotificationFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAndHandleFloatingActionButton() {
    }
    
    @shortbread.Shortcut(id = "createEvent", icon = com.android.joshuamarotta.metronote.R.drawable.ic_add_black_24dp, shortLabel = "Create Event")
    public final boolean transactCreateEventFragment() {
        return false;
    }
    
    private final void navigateUp() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void onReselected(int itemId) {
    }
    
    private final void hideRootMenuItems() {
    }
    
    private final void showRootMenuItems() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void initBottomNavigationView() {
    }
    
    private final void handleProfileNavigationSelected() {
    }
    
    private final void handleExploreNavigationSelected() {
    }
    
    private final void handleHomeNavigationSelected() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.github.yavski.fabspeeddial.FabSpeedDial showFloatingActionButton() {
        return null;
    }
    
    private final io.github.yavski.fabspeeddial.FabSpeedDial closeAndShowFloatingActionButton() {
        return null;
    }
    
    private final io.github.yavski.fabspeeddial.FabSpeedDial closeAndHideFloatingActionButton() {
        return null;
    }
    
    @java.lang.Override()
    public void displayFloatingActionButton() {
    }
    
    public HomeActivity() {
        super();
    }
}