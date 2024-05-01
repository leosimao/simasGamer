package br.com.simao.simasgamer.servicos

import br.com.simao.simasgamer.servicos.interfaces.GamerImp
import br.com.simao.simasgamer.servicos.modelos.Aluguel
import br.com.simao.simasgamer.servicos.modelos.Gamer
import br.com.simao.simasgamer.servicos.modelos.Jogo
import br.com.simao.simasgamer.servicos.modelos.Periodo

class GamerService(val gamer: Gamer) : GamerImp {
    override fun alugarJogo(jogoAlugado: Jogo, periodoAluguel: Periodo): Aluguel {
         val aluguelJogo = Aluguel(gamer, jogoAlugado, periodoAluguel)
         gamer.listaJogosAlugados.add(aluguelJogo)
        return aluguelJogo
    }

    override fun getListAluguelJogo() {
        gamer.listaJogosAlugados.forEach { println(it) }
    }


}