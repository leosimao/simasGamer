package com.br.simas.gamer.model.api.deserializer

import com.google.gson.annotations.SerializedName

data class DeserializerJogoCheapsShark(
    @SerializedName("title") val nomeJogo: String,
    @SerializedName("steamAppID") val steamId: String,
    @SerializedName("thumb") val capaJogo: String
)
