package br.com.simao.simasgamer.api

import br.com.simao.simasgamer.services.dto.Gamer
import br.com.simao.simasgamer.api.deserializer.DeserializerGamer
import br.com.simao.simasgamer.api.deserializer.DeserializerCheapShark
import br.com.simao.simasgamer.api.deserializer.DeserializerJogoLocal
import br.com.simao.simasgamer.services.dto.JogoCheapShark
import br.com.simao.simasgamer.services.dto.JogoLocal
import br.com.simao.simasgamer.utils.converterInfoGamerToGamer
import br.com.simao.simasgamer.utils.converterInfoJogoCheapSharkToJogo
import br.com.simao.simasgamer.utils.converterInfoJogoLocalToJogo
import br.com.simao.simasgamer.utils.fromListJson
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ConsumoAPI {
    private val URl_API_CHEAP_SHARK = "https://www.cheapshark.com/api/1.0/"
    private val URL_LOCAL_GAMERS = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"
    private val URL_LOCAL_JOGOS = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json"

    private fun realizarRequest(url: String): String{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString()).body()
        return response
    }

    fun getListGamer(): List<Gamer>{
        val gsonGamer = Gson()
        val responseGamer = realizarRequest(URL_LOCAL_GAMERS)
        val listInfoGamer = gsonGamer.fromListJson<DeserializerGamer>(responseGamer)
        return listInfoGamer.map { infoGamer -> infoGamer.converterInfoGamerToGamer() }
    }

    fun getListJogoPorNome(tituloJogo: String): List<JogoCheapShark>{
        val gsonJogo = Gson()
        val responseJogo = realizarRequest("${URl_API_CHEAP_SHARK}games?title=${tituloJogo}")
        val listInfoJogo = gsonJogo.fromListJson<DeserializerCheapShark>(responseJogo)
        return listInfoJogo.map { infoJogo -> infoJogo.converterInfoJogoCheapSharkToJogo() }
    }

    fun getListJogoLocal(): List<JogoLocal>{
        val gsonJogo = Gson()
        val responseJogo = realizarRequest(URL_LOCAL_JOGOS)
        val listInfoJogoLocal = gsonJogo.fromListJson<DeserializerJogoLocal>(responseJogo)
        return listInfoJogoLocal.map { infoJogoLocal -> infoJogoLocal.converterInfoJogoLocalToJogo() }
    }
}