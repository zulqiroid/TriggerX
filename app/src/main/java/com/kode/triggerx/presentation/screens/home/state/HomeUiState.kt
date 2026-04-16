package com.kode.triggerx.presentation.screens.home.state

import com.kode.triggerx.domain.model.AutomationRule

data class HomeUiState(

    val isLoading: Boolean = false,

    val rules: List<AutomationRule> = emptyList(),

    val error: String? = null
)