package com.kode.triggerx.data.local.mapper

import com.kode.triggerx.data.local.entity.AutomationRuleEntity
import com.kode.triggerx.domain.model.ActionType
import com.kode.triggerx.domain.model.AutomationRule
import com.kode.triggerx.domain.model.TriggerType

object AutomationRuleMapper {

    fun toDomain(entity: AutomationRuleEntity): AutomationRule {
        return AutomationRule(
            id = entity.id,
            trigger = mapTrigger(entity.trigger),
            action = mapAction(entity.action),
            isEnabled = entity.isEnabled
        )
    }

    fun toEntity(domain: AutomationRule): AutomationRuleEntity {
        return AutomationRuleEntity(
            id = domain.id,
            trigger = domain.trigger.toString(),
            action = domain.action.toString(),
            isEnabled = domain.isEnabled
        )
    }

    private fun mapTrigger(trigger: String): TriggerType {
        return when (trigger) {
            TriggerType.ChargerConnected.toString() -> TriggerType.ChargerConnected
            TriggerType.ScreenOn.toString() -> TriggerType.ScreenOn
            else -> throw IllegalArgumentException("Unknown trigger: $trigger")
        }
    }

    private fun mapAction(action: String): ActionType {
        return when (action) {
            ActionType.ShowNotification.toString() -> ActionType.ShowNotification
            ActionType.Vibrate.toString() -> ActionType.Vibrate
            else -> throw IllegalArgumentException("Unknown action: $action")
        }
    }
}