package br.com.simao.simasgamer

import br.com.simao.simasgamer.API.ConsumoAPI
import br.com.simao.simasgamer.servicos.GamerService
import br.com.simao.simasgamer.servicos.modelos.Periodo
import java.time.LocalDate

fun main() {
    val getGamer = ConsumoAPI().getListGamer()[1]
    val getJogo1 = ConsumoAPI().getListJogoPorNome("mario")[1]
    val getJogo2 = ConsumoAPI().getListJogoPorNome("batman")[2]
    val getJogo3 = ConsumoAPI().getListJogoPorNome("star")[3]

    val gamerService = GamerService(getGamer)
    val periodoAluguel = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    gamerService.alugarJogo(getJogo1, periodoAluguel)
    gamerService.alugarJogo(getJogo2, periodoAluguel)
    gamerService.alugarJogo(getJogo3, periodoAluguel)

    println(gamerService.getListAluguelJogo())
}