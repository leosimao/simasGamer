package br.com.simao.simasgamer.utils

import br.com.simao.simasgamer.services.dto.Gamer
import br.com.simao.simasgamer.api.deserializer.DeserializerGamer
import br.com.simao.simasgamer.controller.PlanoController
import br.com.simao.simasgamer.enum.PlanoEnum

fun DeserializerGamer.converterInfoGamerToGamer(): Gamer {
    return Gamer(this.nomeGamer, this.emailGamer, this.dataNascimentoGamer, this.usuarioGamer, PlanoController().getPlanoGamer(PlanoEnum.BRONZE))
}