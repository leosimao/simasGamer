package com.br.simas.gamer.utils

import com.br.simas.gamer.model.api.deserializer.DeserializerJogoCheapsShark
import com.br.simas.gamer.model.domain.Jogo

fun DeserializerJogoCheapsShark.converterInfoJogoCheapSharkToJogo(): Jogo {
    return Jogo(this.nomeJogo,  this.steamId, this.capaJogo)
}