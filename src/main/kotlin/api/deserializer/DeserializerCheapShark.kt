package com.br.simas.gamer.api.deserializer

import com.google.gson.annotations.SerializedName

data class DeserializerCheapShark(
    @SerializedName("external") val nomeJogo: String,
    @SerializedName("cheapest") val precoJogo: Double,
    @SerializedName("thumb") val capaJogo: String
){}
