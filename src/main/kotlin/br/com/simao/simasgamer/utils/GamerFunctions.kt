package br.com.simao.simasgamer.utils

import br.com.simao.simasgamer.servicos.modelos.Gamer
import br.com.simao.simasgamer.api.deserializer.DeserializerGamer

fun DeserializerGamer.converterInfoGamerToGamer(): Gamer {
    return Gamer(this.nomeGamer, this.emailGamer, this.dataNascimentoGamer, this.usuarioGamer)
}