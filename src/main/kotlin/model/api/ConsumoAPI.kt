package com.br.simas.gamer.model.api

import com.br.simas.gamer.model.api.deserializer.DeserializerInfoJogoCheapShark
import com.br.simas.gamer.model.domain.Jogo
import com.br.simas.gamer.utils.converterInfoJogoCheapSharkToJogo
import com.br.simas.gamer.utils.fromJsonId
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

    fun getJogoById(idJogo: String): Jogo {
        val gsonJogo = Gson()
        val responseJogo = realizarRequest("${URl_API_CHEAP_SHARK}games?id=$idJogo")
        val infoJogo = gsonJogo.fromJsonId<DeserializerInfoJogoCheapShark>(responseJogo)
        return infoJogo.jogoCheapshark.converterInfoJogoCheapSharkToJogo()
    }
}