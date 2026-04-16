package com.kode.triggerx.domain.model

data class AutomationRule(
    val id: Long,
    val trigger: TriggerType,
    val action: ActionType,
    val isEnabled: Boolean
)