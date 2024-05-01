package br.com.simao.simasgamer.servicos.modelos

data class Aluguel(
    val gamer: Gamer,
    val jogoAlugado: Jogo,
    val periodoAluguel: Periodo
){}