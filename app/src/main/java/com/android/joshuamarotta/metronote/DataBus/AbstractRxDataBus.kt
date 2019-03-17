package com.android.joshuamarotta.metronote.DataBus

import io.reactivex.Scheduler
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.ConcurrentHashMap

abstract class AbstractRxDataBus<T>(private val tag: String) {

    private val disposableMap: MutableMap<Consumer<T>, Disposable> = ConcurrentHashMap()
    private val publishSubject = PublishSubject.create<T>()

    fun post(event: T) {
        if (publishSubject.hasObservers()) publishSubject.onNext(event)
    }

    @Synchronized
    fun subscribe(subscribeOn: Scheduler, observeOn: Scheduler, onNext: Consumer<T>) {
        if (disposableMap.containsKey(onNext)) {
            disposableMap[onNext]
        } else if (!disposableMap.containsKey(onNext)) {
            val disposable = publishSubject
                .subscribeOn(subscribeOn)
                .observeOn(observeOn)
                .subscribe(onNext, Consumer { throwable -> println("$tag, ${throwable.localizedMessage}") })
            disposableMap[onNext] = disposable
        }
    }

    fun unsubscribe(onNext: Consumer<T>) {
        disposableMap.containsKey(onNext).apply {
            disposableMap.remove(onNext).let { it?.dispose() }
        }
    }

    fun hasActiveSubject() = disposableMap.isNotEmpty()
}