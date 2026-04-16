package com.kode.triggerx.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "automation_rules")
data class AutomationRuleEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val trigger: String,

    val action: String,

    val isEnabled: Boolean
)