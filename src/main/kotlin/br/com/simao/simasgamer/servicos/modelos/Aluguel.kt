package br.com.simao.simasgamer.servicos.modelos

data class Aluguel(
    val gamer: Gamer,
    val periodoAluguel: Periodo,
    val isJogoLocal: Boolean
){
    var jogoAlugadoLocal: JogoLocal? = null
    var jogoAlugadoCheapShark: JogoCheapShark? = null

    constructor(gamer: Gamer, jogoLocalAlugado: JogoLocal, periodoAluguel: Periodo, isJogoLocal: Boolean):
            this(gamer, periodoAluguel, isJogoLocal){
            this.jogoAlugadoLocal = jogoLocalAlugado
    }

    constructor(gamer: Gamer, jogoLocalAlugado: JogoCheapShark, periodoAluguel: Periodo, isJogoLocal: Boolean):
            this(gamer, periodoAluguel, isJogoLocal){
            this.jogoAlugadoCheapShark = jogoLocalAlugado
    }

}