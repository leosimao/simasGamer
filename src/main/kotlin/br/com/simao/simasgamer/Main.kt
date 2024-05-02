package br.com.simao.simasgamer

import br.com.simao.simasgamer.api.ConsumoAPI
import br.com.simao.simasgamer.servicos.GamerService
import br.com.simao.simasgamer.servicos.modelos.Periodo
import java.time.LocalDate

fun main() {
    val getGamer = ConsumoAPI().getListGamer()[1]
    val getJogo1 = ConsumoAPI().getListJogoPorNome("mario")[1]
    val getJogo2 = ConsumoAPI().getListJogoPorNome("batman")[2]
    val getJogo3 = ConsumoAPI().getListJogoPorNome("star")[3]

    val getJogoLocal1 = ConsumoAPI().getListJogoLocal()[1]
    val getJogoLocal2 = ConsumoAPI().getListJogoLocal()[2]
    val getJogoLocal3 = ConsumoAPI().getListJogoLocal()[3]

    val gamerService = GamerService(getGamer)
    val periodoAluguel = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    gamerService.alugarJogo(getJogo1, periodoAluguel)
    gamerService.alugarJogo(getJogo2, periodoAluguel)
    gamerService.alugarJogo(getJogo3, periodoAluguel)

    gamerService.alugarJogo(getJogoLocal1, periodoAluguel)
    gamerService.alugarJogo(getJogoLocal2, periodoAluguel)
    gamerService.alugarJogo(getJogoLocal3, periodoAluguel)

    println(gamerService.getListAluguelJogo())
}