package br.com.simao.simasgamer.modelo

import kotlin.random.Random

data class Gamer(var nomeGamer:String, var emailGamer:String){
    var dataNascimentoGamer:String? = null
    var usuarioGamer:String? = null
        set(usuarioGamer) {
            field = usuarioGamer
            if(idGamer.isNullOrBlank()){
                criarIdInterno()
            }
        }
    var idGamer: String? = null
        private set

    init {
        this.emailGamer = validarEmail()
        this.nomeGamer = validarNome()
    }

    constructor(
        nomeGamer: String,
        emailGamer: String,
        dataNascimentoGamer: String,
        usuarioGamer: String
    ): this(nomeGamer, emailGamer) {
        this.dataNascimentoGamer = dataNascimentoGamer
        this.usuarioGamer = usuarioGamer
        criarIdInterno()
    }

    private fun criarIdInterno(){
        val randomNumero = Random.nextInt(1000)
        val tagGamer = String.format("%04d", randomNumero)

        this.idGamer = "$usuarioGamer#$tagGamer"
    }

    private fun validarEmail(): String{
        val regexEmail = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
        if (regexEmail.matches(emailGamer)){
            return emailGamer
        } else {
            throw IllegalArgumentException("Email informado está inválido")
        }
    }

    private fun validarNome(): String {
        if(!nomeGamer.isNullOrBlank()){
            return nomeGamer
        } else
            throw IllegalArgumentException("Nome do jogador está inválido")
    }

}
