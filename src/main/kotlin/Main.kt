package com.br.simas.gamer

import com.br.simas.gamer.model.api.ConsumoAPI

fun main() {
    val consumoAPI = ConsumoAPI()
    val jogo = consumoAPI.getJogoById("192")
    println(jogo)
}