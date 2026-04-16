package com.kode.triggerx.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kode.triggerx.data.local.dao.AutomationRuleDao
import com.kode.triggerx.data.local.entity.AutomationRuleEntity

@Database(
    entities = [
        AutomationRuleEntity::class
    ],
    version = 1
)
abstract class TriggerXDatabase: RoomDatabase() {
    abstract fun automationRuleDao(): AutomationRuleDao
}