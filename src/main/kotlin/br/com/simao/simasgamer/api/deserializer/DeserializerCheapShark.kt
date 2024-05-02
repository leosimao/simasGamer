package br.com.simao.simasgamer.api.deserializer

import com.google.gson.annotations.SerializedName

data class DeserializerCheapShark(
    @SerializedName("gameID") val idJogo: Int,
    @SerializedName("steamAppID") val idJogoAppSteam: Int?,
    @SerializedName("external") val nomeJogo: String,
    @SerializedName("internalName") val nomeInternoJogo: String
){}