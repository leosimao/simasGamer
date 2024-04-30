package br.com.simao.simasgamer.principal

import br.com.simao.simasgamer.modelo.InfoJogo
import br.com.simao.simasgamer.modelo.Jogo
import br.com.simao.simasgamer.servicos.ConsumoAPI
import com.google.gson.Gson
import java.util.Scanner



fun main() {
    val getTeclado = Scanner(System.`in`)
    println("Digite o id do jogo desejado!")
    val getIdJogo = getTeclado.nextLine()

    val getJogoById = ConsumoAPI().getJogoById(getIdJogo)

    var jsonDeserializer: InfoJogo? = null
    val responseAPI = runCatching {
        val deserializerGson = Gson()
        jsonDeserializer = deserializerGson.fromJson(
            getJogoById,
            InfoJogo::class.java
        )
    }

    responseAPI.onSuccess {
        var meuJogo = Jogo(
            jsonDeserializer?.infoJogo?.nomeJogo,
            jsonDeserializer?.infoJogo?.imagemJogo
        )
        println("Deseja colocar uma descrição personalizada no seu Jogo? S/N")
        val getRespostaDescricao = getTeclado.nextLine()
        if (getRespostaDescricao.equals("S", true)) {
            println("Digite a descrição desejada!")
            meuJogo.descricaoJogo = getTeclado.nextLine()
        } else{
            meuJogo.descricaoJogo = meuJogo.nomeJogo
        }

        println(meuJogo)
    }

    responseAPI.onFailure {
        println("Ops! Parece que ocorreu um erro, o jogo pesquisado não foi encontrado.")
    }
}