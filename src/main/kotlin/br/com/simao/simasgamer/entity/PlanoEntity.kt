package br.com.simao.simasgamer.entity

import br.com.simao.simasgamer.enum.PlanoEnum

data class PlanoEntity(
    val nivelPlano: PlanoEnum,
    val valorPlano: Double,
    val quantidadeJogoPlano: Int
)
