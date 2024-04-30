package br.com.simao.simasgamer.servicos

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ConsumoAPI {
    private val URl_API_CHEAP_SHARK = "https://www.cheapshark.com/api/1.0/"
    private val URL_LOCAL_GAMERS = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"
    private val URL_LOCAL_JOGOS = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json"

    private fun realizarRequest(url: String, parametros:String?): String{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url+parametros))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString()).body()
        return response
    }

    fun getJogoById(idJogo: String): String{
        val parametros = "games?id=${idJogo}"
        return realizarRequest(URl_API_CHEAP_SHARK, parametros)
    }
}