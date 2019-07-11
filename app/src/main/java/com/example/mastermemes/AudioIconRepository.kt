package com.example.mastermemes

class AudioIconRepository(private val provider: AudioIconResourceProvider) {

    fun fetchIcons() :  List<AudioIcon> {
        return provider.createList()
    }
}