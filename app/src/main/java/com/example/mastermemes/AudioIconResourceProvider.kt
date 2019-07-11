package com.example.mastermemes

class AudioIconResourceProvider {

    val bixaMuda = AudioIcon(R.raw.bixamuda, R.drawable.bixamuda_3x)
    val bonner = AudioIcon(R.raw.bonner, R.drawable.bonner_3x)
    val pepino = AudioIcon(R.raw.pepino, R.drawable.pepino_3x)
    val pepinoDeNovo = AudioIcon(R.raw.pepinodenovo, R.drawable.pepinodenovo_3x)
    val rafinha = AudioIcon(R.raw.rafinha, R.drawable.rafinha_3x)
    val seisEOnibus = AudioIcon(R.raw.seiseonibus, R.drawable.seiseonibus_3x)

    fun createList() : List<AudioIcon> {
        return listOf(bixaMuda, bonner, pepino, pepinoDeNovo, rafinha, seisEOnibus)
    }
}