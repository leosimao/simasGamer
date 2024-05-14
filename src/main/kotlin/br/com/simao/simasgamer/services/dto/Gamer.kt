package br.com.simao.simasgamer.services.dto

data class Gamer(
    val nomeGamer: String,
    val emailGamer: String,
    val dataNascimentoGamer: String,
    val usuarioGamer: String,
    val planoGamer: Plano
){
    val listaJogosAlugados = mutableListOf<Aluguel>()
}
