package br.com.simao.simasgamer.modelo

import kotlin.random.Random

data class Usuario(var nomeUsuario:String, var emailUsuario:String){
    var dataNascimentoUsuario:String? = null
    var nicknameUsuario:String? = null
        set(usuarioGamer) {
            field = usuarioGamer
            if(idGamer.isNullOrBlank()){
                criarIdInterno()
            }
        }
    var idGamer: String? = null
        private set

    init {
        this.emailUsuario = validarEmail()
        this.nomeUsuario = validarNome()
    }

    constructor(
        nomeGamer: String,
        emailGamer: String,
        dataNascimentoGamer: String,
        usuarioGamer: String
    ): this(nomeGamer, emailGamer) {
        this.dataNascimentoUsuario = dataNascimentoGamer
        this.nicknameUsuario = usuarioGamer
        criarIdInterno()
    }

    private fun criarIdInterno(){
        val randomNumero = Random.nextInt(1000)
        val tagGamer = String.format("%04d", randomNumero)

        this.idGamer = "$nicknameUsuario#$tagGamer"
    }

    private fun validarEmail(): String{
        val regexEmail = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
        if (regexEmail.matches(emailUsuario)){
            return emailUsuario
        } else {
            throw IllegalArgumentException("Email informado est� inv�lido")
        }
    }

    private fun validarNome(): String {
        if(!nomeUsuario.isNullOrBlank()){
            return nomeUsuario
        } else
            throw IllegalArgumentException("Nome do jogador est� inv�lido")
    }

}
