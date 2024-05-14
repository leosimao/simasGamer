package br.com.simao.simasgamer.services

import br.com.simao.simasgamer.enum.PlanoEnum
import br.com.simao.simasgamer.services.dto.Plano

class PlanoService {
    fun getPlanoGamer(planoEnum: PlanoEnum): Plano {
        return when(planoEnum) {
            PlanoEnum.PRATA -> Plano(PlanoEnum.PRATA, 9.90, 1)
            PlanoEnum.OURO -> Plano(PlanoEnum.OURO, 19.90, 3)
            PlanoEnum.PLATINA -> Plano(PlanoEnum.PLATINA, 25.90, 5)
            PlanoEnum.DIAMANTE -> Plano(PlanoEnum.DIAMANTE, 35.90, 10)
            else -> Plano(PlanoEnum.BRONZE, 0.0, 0)
        }
    }
}