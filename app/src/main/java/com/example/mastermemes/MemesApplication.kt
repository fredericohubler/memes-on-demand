package com.example.mastermemes

import android.app.Application
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin

class MemesApplication : Application(), KoinComponent {
    var modulesLoader by inject<MemesModulesLoaderImpl>()
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@MemesApplication)
            modules(myModule)
        }
    }
}