package com.android.joshuamarotta.metronote.DataBus

class RxDataBusImpl private constructor(): AbstractRxDataBus<RxDataBusEvent>("RxDataBusImpl") {
    companion object { val instance: RxDataBusImpl by lazy { RxDataBusImpl() } }
}