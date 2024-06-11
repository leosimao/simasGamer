package com.br.simas.gamer.api

import com.br.simas.gamer.api.deserializer.DeserializerCheapShark
import com.br.simas.gamer.model.domain.Jogo
import com.br.simas.gamer.utils.converterInfoJogoCheapSharkToJogo
import com.br.simas.gamer.utils.fromListJson
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ConsumoAPI {
    private val URl_API_CHEAP_SHARK = "https://www.cheapshark.com/api/1.0/"

    private fun realizarRequest(url: String): String{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString()).body()
        return response
    }

    fun getListJogoPorNome(tituloJogo: String): List<Jogo>{
        val gsonJogo = Gson()
        val responseJogo = realizarRequest("${URl_API_CHEAP_SHARK}games?title=${tituloJogo}")
        val listInfoJogo = gsonJogo.fromListJson<DeserializerCheapShark>(responseJogo)
        return listInfoJogo.map { infoJogo -> infoJogo.converterInfoJogoCheapSharkToJogo() }
    }
}