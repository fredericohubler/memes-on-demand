package com.example.mastermemes

import org.koin.core.module.Module

interface MemesModulesLoader {
    fun getModules(): List<Module>
}