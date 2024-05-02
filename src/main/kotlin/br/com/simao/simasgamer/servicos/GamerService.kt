package br.com.simao.simasgamer.servicos

import br.com.simao.simasgamer.servicos.interfaces.GamerImp
import br.com.simao.simasgamer.servicos.modelos.*

class GamerService(val gamer: Gamer) : GamerImp {
    override fun alugarJogo(jogoCheapSharkAlugado: JogoCheapShark, periodoAluguel: Periodo): Aluguel {
         val aluguelJogo = Aluguel(gamer, jogoCheapSharkAlugado, periodoAluguel, false)
         gamer.listaJogosAlugados.add(aluguelJogo)
         return aluguelJogo
    }

    override fun alugarJogo(jogoLocalAlugado: JogoLocal, periodoAluguel: Periodo): Aluguel {
        val aluguelJogo = Aluguel(gamer, jogoLocalAlugado, periodoAluguel, true)
        gamer.listaJogosAlugados.add(aluguelJogo)
        return aluguelJogo
    }

    override fun getListAluguelJogo() {
        gamer.listaJogosAlugados.forEach { println(it) }
    }
}