package br.com.simao.simasgamer.servicos.modelos

data class Gamer(
    val nomeGamer: String,
    val emailGamer: String,
    val dataNascimentoGamer: String,
    val usuarioGamer: String,
){
    val listaJogosAlugados = mutableListOf<Aluguel>()
}
