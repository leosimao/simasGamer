package br.com.simao.simasgamer.utils

import br.com.simao.simasgamer.API.InfoJogo.InfoJogo
import br.com.simao.simasgamer.servicos.modelos.Jogo

fun InfoJogo.converterInfoJogoToJogo(): Jogo {
    return Jogo(this.idJogo, this.idJogoAppSteam, this.nomeJogo, this.nomeInternoJogo)
}