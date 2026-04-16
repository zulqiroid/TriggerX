package com.kode.triggerx.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.kode.triggerx.data.local.entity.AutomationRuleEntity

@Dao
interface AutomationRuleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRule(rule: AutomationRuleEntity)

    @Query("SELECT * FROM automation_rules")
    suspend fun getAllRules(): List<AutomationRuleEntity>

    @Query("SELECT * FROM automation_rules WHERE isEnabled = 1")
    suspend fun getEnabledRules(): List<AutomationRuleEntity>

    @Update
    suspend fun updateRule(rule: AutomationRuleEntity)

    @Delete
    suspend fun deleteRule(rule: AutomationRuleEntity)
}