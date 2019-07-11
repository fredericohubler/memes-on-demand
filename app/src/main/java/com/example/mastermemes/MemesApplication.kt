package com.example.mastermemes

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin

class MemesApplication : Application(), KoinComponent {

    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@MemesApplication)
            modules(MemesModulesLoaderImpl().getModules())
        }
    }
}