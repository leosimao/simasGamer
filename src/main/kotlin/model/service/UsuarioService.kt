package com.br.simas.gamer.model.service

import com.br.simas.gamer.model.domain.Usuario
import com.br.simas.gamer.model.dto.UsuarioDTO

class UsuarioService {

    fun criarUsuario(usuarioDTO: UsuarioDTO) {
        val usuarioEntity = Usuario(
            1,
            usuarioDTO.nomeUsuario,
            usuarioDTO.emailUsuario,
            usuarioDTO.senhaUsuario,
            usuarioDTO.apelidoUsuario
        )
    }

    fun editarUsuario(idUsuario: Int) {
    }

    fun getUsuario(idUsuario: Int){
    }
}