package com.kode.triggerx.domain.repository

import com.kode.triggerx.domain.model.AutomationRule

interface AutomationRepository {
    suspend fun insertRule(rule: AutomationRule)

    suspend fun getAllRules(): List<AutomationRule>

    suspend fun getEnabledRules(): List<AutomationRule>

    suspend fun updateRule(rule: AutomationRule)

    suspend fun deleteRule(rule: AutomationRule)
}