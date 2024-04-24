package br.com.simao.simasgamer.modelo

import kotlin.random.Random

data class Gamer(val nomeGamer:String, var emailGamer:String){
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

}
