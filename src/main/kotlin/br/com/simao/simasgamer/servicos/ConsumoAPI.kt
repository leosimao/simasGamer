package br.com.simao.simasgamer.servicos

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
class ConsumoAPI {
    private val urlAPI = "https://www.cheapshark.com/api/1.0/"
    private fun realizarRequest(parametros:String): String{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(urlAPI+parametros))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString()).body()
        return response
    }

    fun getJogoById(idJogo: String): String{
        val parametros = "games?id=${idJogo}"
        return realizarRequest(parametros)
    }
}