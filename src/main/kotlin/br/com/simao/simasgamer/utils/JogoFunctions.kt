package br.com.simao.simasgamer.utils

import br.com.simao.simasgamer.api.deserializer.DeserializerCheapShark
import br.com.simao.simasgamer.api.deserializer.DeserializerJogoLocal
import br.com.simao.simasgamer.servicos.modelos.JogoCheapShark
import br.com.simao.simasgamer.servicos.modelos.JogoLocal

fun DeserializerCheapShark.converterInfoJogoCheapSharkToJogo(): JogoCheapShark {
    return JogoCheapShark(this.idJogo, this.idJogoAppSteam, this.nomeJogo, this.nomeInternoJogo)
}

fun DeserializerJogoLocal.converterInfoJogoLocalToJogo(): JogoLocal {
    return JogoLocal(this.nomeJogo, this.capaJogo, this.precoJogo, this.descricaoJogo)
}