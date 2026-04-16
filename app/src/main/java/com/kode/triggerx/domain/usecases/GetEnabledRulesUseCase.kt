package com.kode.triggerx.domain.usecases

import com.kode.triggerx.domain.model.AutomationRule
import com.kode.triggerx.domain.repository.AutomationRepository

class GetEnabledRulesUseCase(
    private val repository: AutomationRepository
) {
    suspend operator fun invoke(): List<AutomationRule> {
        return repository.getEnabledRules()
    }
}