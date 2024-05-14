package br.com.simao.simasgamer.controller

import br.com.simao.simasgamer.enum.PlanoEnum
import br.com.simao.simasgamer.services.GamerService
import br.com.simao.simasgamer.services.dto.Gamer

class GamerController {
    private val gamerService = GamerService()
    fun criarGamer(
        nomeGamer: String,
        emailGamer: String,
        dataNascimentoGamer: String,
        usuarioGamer: String,
        planoGamer: PlanoEnum
    ){

        val gamer = Gamer(
            nomeGamer,
            emailGamer,
            dataNascimentoGamer,
            usuarioGamer,
            PlanoController().getPlanoGamer(planoGamer)
        )

        gamerService.criarGamer(gamer)
    }
}