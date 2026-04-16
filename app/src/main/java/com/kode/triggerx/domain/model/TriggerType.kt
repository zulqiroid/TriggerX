package com.kode.triggerx.domain.model

sealed class TriggerType {

    data object ChargerConnected : TriggerType()

    data object ScreenOn : TriggerType()
}