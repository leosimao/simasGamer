package br.com.simao.simasgamer.services.dto

import br.com.simao.simasgamer.enum.PlanoEnum

data class Plano(
    val nivelPlano: PlanoEnum,
    val valorPlano: Double,
    val quantidadeJogoPlano: Int
)
