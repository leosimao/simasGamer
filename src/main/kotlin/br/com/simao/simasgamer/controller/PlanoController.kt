package br.com.simao.simasgamer.controller

import br.com.simao.simasgamer.enum.PlanoEnum
import br.com.simao.simasgamer.services.PlanoService
import br.com.simao.simasgamer.services.dto.Plano

class PlanoController {
    fun getPlanoGamer(planoEnum: PlanoEnum): Plano {
        return PlanoService().getPlanoGamer(planoEnum)
    }
}