package com.example.mastermemes

import org.koin.dsl.module

class MemesModulesLoaderImpl : MemesModulesLoader{

    val appModule = module {

        single { AudioIconRepository(get())}
        single { AudioIconResourceProvider()}
    }

}

interface MemesModulesLoader
