package com.kode.triggerx.data.repository.implementation

import com.kode.triggerx.data.local.dao.AutomationRuleDao
import com.kode.triggerx.data.local.mapper.AutomationRuleMapper
import com.kode.triggerx.domain.model.AutomationRule
import com.kode.triggerx.domain.repository.AutomationRepository

class AutomationRepositoryImpl(
    private val dao: AutomationRuleDao
) : AutomationRepository {

    override suspend fun insertRule(rule: AutomationRule) {
        dao.insertRule(AutomationRuleMapper.toEntity(rule))
    }

    override suspend fun getAllRules(): List<AutomationRule> {
        return dao.getAllRules().map {
            AutomationRuleMapper.toDomain(it)
        }
    }

    override suspend fun getEnabledRules(): List<AutomationRule> {
        return dao.getEnabledRules().map {
            AutomationRuleMapper.toDomain(it)
        }
    }

    override suspend fun updateRule(rule: AutomationRule) {
        dao.updateRule(AutomationRuleMapper.toEntity(rule))
    }

    override suspend fun deleteRule(rule: AutomationRule) {
        dao.deleteRule(AutomationRuleMapper.toEntity(rule))
    }
}