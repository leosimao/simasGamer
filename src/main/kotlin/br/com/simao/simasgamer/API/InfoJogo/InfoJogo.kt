package br.com.simao.simasgamer.API.InfoJogo

import com.google.gson.annotations.SerializedName

data class InfoJogo(
    @SerializedName("gameID") val idJogo: Int,
    @SerializedName("steamAppID") val idJogoAppSteam: Int?,
    @SerializedName("external") val nomeJogo: String,
    @SerializedName("internalName") val nomeInternoJogo: String
){}
