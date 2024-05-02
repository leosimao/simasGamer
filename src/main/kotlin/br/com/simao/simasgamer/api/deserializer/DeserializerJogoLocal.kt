package br.com.simao.simasgamer.api.deserializer

import com.google.gson.annotations.SerializedName

data class DeserializerJogoLocal(
    @SerializedName("titulo") val nomeJogo : String,
    @SerializedName("capa") val capaJogo: String,
    @SerializedName("preco") val precoJogo: Double,
    @SerializedName("descricao") val descricaoJogo: String
){}
