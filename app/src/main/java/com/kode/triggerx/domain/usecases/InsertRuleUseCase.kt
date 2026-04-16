package com.kode.triggerx.domain.usecases

import com.kode.triggerx.domain.model.AutomationRule
import com.kode.triggerx.domain.repository.AutomationRepository

class InsertRuleUseCase (
    val repository : AutomationRepository
){
    suspend operator fun invoke(
        rule: AutomationRule
    ){
        repository.insertRule(rule)
    }
}