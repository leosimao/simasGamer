package br.com.simao.simasgamer.servicos.interfaces

import br.com.simao.simasgamer.servicos.modelos.Aluguel
import br.com.simao.simasgamer.servicos.modelos.JogoCheapShark
import br.com.simao.simasgamer.servicos.modelos.JogoLocal
import br.com.simao.simasgamer.servicos.modelos.Periodo

interface GamerImp {
    fun alugarJogo(jogoCheapSharkAlugado: JogoCheapShark, periodoAluguel: Periodo): Aluguel
    fun alugarJogo(jogoLocalAlugado: JogoLocal, periodoAluguel: Periodo): Aluguel
    fun getListAluguelJogo()
}