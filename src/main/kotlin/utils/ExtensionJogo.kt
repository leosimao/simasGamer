package com.br.simas.gamer.utils

import com.br.simas.gamer.api.deserializer.DeserializerCheapShark
import com.br.simas.gamer.model.domain.Jogo

fun DeserializerCheapShark.converterInfoJogoCheapSharkToJogo(): Jogo {
    return Jogo(this.nomeJogo,  this.precoJogo, this.capaJogo)
}