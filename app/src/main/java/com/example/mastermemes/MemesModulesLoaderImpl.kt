package com.example.mastermemes

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

class MemesModulesLoaderImpl: MemesModulesLoader {

    private val appModule = module {

        single { AudioIconRepository(get())}
        single { AudioIconResourceProvider()}
        viewModel { MainViewModel(get()) }
    }

    override fun getModules(): List<Module> {
        return listOf(appModule)
    }
}