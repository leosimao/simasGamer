package br.com.simao.simasgamer.servicos.modelos

data class Jogo (
    val idJogo: Int,
    val idJogoAppSteam: Int?,
    val nomeJogo: String,
    val nomeInternoJogo: String
) {}