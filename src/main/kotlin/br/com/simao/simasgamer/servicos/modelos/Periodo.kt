package br.com.simao.simasgamer.servicos.modelos

import java.time.LocalDate
import java.time.Period

data class Periodo(
    val dataInicial: LocalDate,
    val dataFinal: LocalDate
){
    val peridoAluguelEmDias = Period.between(dataInicial, dataFinal).days
}
