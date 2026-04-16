package com.kode.triggerx.di.dataModule

import androidx.room.Room
import com.kode.triggerx.core.constants.AppConstants
import com.kode.triggerx.data.local.db.TriggerXDatabase
import com.kode.triggerx.data.repository.implementation.AutomationRepositoryImpl
import com.kode.triggerx.domain.repository.AutomationRepository
import org.koin.dsl.module

val dataModule= module {


    single {
        Room.databaseBuilder(
            get(),
            TriggerXDatabase::class.java,
            AppConstants.DATABASE_NAME
        ).build()
    }

    single {
        get<TriggerXDatabase>().automationRuleDao()
    }

    single<AutomationRepository>{ AutomationRepositoryImpl(get()) }

}