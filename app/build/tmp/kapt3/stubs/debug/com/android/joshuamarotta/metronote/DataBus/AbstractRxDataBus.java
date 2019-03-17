package com.android.joshuamarotta.metronote.DataBus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u0014\u0010\u0018\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\bR \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00018\u00008\u00000\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/android/joshuamarotta/metronote/DataBus/AbstractRxDataBus;", "T", "", "tag", "", "(Ljava/lang/String;)V", "disposableMap", "", "Lio/reactivex/functions/Consumer;", "Lio/reactivex/disposables/Disposable;", "publishSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "hasActiveSubject", "", "post", "", "event", "(Ljava/lang/Object;)V", "subscribe", "subscribeOn", "Lio/reactivex/Scheduler;", "observeOn", "onNext", "unsubscribe", "app_debug"})
public abstract class AbstractRxDataBus<T extends java.lang.Object> {
    private final java.util.Map<io.reactivex.functions.Consumer<T>, io.reactivex.disposables.Disposable> disposableMap = null;
    private final io.reactivex.subjects.PublishSubject<T> publishSubject = null;
    private final java.lang.String tag = null;
    
    public final void post(T event) {
    }
    
    public final synchronized void subscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler subscribeOn, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler observeOn, @org.jetbrains.annotations.NotNull()
    io.reactivex.functions.Consumer<T> onNext) {
    }
    
    public final void unsubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.functions.Consumer<T> onNext) {
    }
    
    public final boolean hasActiveSubject() {
        return false;
    }
    
    public AbstractRxDataBus(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        super();
    }
}