package com.example.mastermemes

class AudioIconResourceProvider {

    val BixaMuda = AudioIcon(R.raw.BixaMuda, R.drawable.bixamuda_3x)
    val Bonner = AudioIcon(R.raw.Bonner, R.drawable.bonner_3x)
    val Pepino = AudioIcon(R.raw.Pepino, R.drawable.pepino_3x)
    val PepinoDeNovo = AudioIcon(R.raw.PepinoDenovo, R.drawable.pepinodenovo_3x)
    val Rafinha = AudioIcon(R.raw.Rafinha, R.drawable.rafinha_3x)
    val SeisEOnibus = AudioIcon(R.raw.SeisEOnibus, R.drawable.seiseonibus_3x)

    fun createList() : List<AudioIcon> {
        return listOf(BixaMuda, Bonner, Pepino, PepinoDeNovo, Rafinha, SeisEOnibus)
    }
}