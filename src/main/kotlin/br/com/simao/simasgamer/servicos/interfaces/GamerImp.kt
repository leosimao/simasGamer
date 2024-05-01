package br.com.simao.simasgamer.servicos.interfaces

import br.com.simao.simasgamer.servicos.modelos.Aluguel
import br.com.simao.simasgamer.servicos.modelos.Jogo
import br.com.simao.simasgamer.servicos.modelos.Periodo

interface GamerImp {
    fun alugarJogo(jogoAlugado: Jogo, periodoAluguel: Periodo): Aluguel
    fun getListAluguelJogo()
}