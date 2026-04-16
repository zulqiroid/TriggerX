package com.kode.triggerx.domain.model

sealed class ActionType {

    data object ShowNotification : ActionType()

    data object Vibrate : ActionType()
}