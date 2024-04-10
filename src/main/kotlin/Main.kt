
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=15"))
        .build()

    val response = client.send(request, BodyHandlers.ofString())
    val jsonJogo = response.body()
    println(jsonJogo)

    val gson = Gson()
    val meuJogo = gson.fromJson(
        "title: Jesus, thumb: imagem",
        Jogo::class.java)
    println(meuJogo)

}