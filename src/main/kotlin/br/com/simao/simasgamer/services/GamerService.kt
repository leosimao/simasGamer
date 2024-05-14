package br.com.simao.simasgamer.services

import br.com.simao.simasgamer.enum.PlanoEnum
import br.com.simao.simasgamer.services.dto.Gamer
import br.com.simao.simasgamer.services.dto.Plano

class GamerService {
    fun criarGamer(gamer: Gamer){
        if (!validarEmailGamer(gamer.emailGamer)){
            throw Exception("Email do jogador Inválido")
        }
    }

    private fun validarEmailGamer(emailGamer: String): Boolean {
        val validacaoRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
        return validacaoRegex.matches(emailGamer)
    }
}