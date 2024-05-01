package br.com.simao.simasgamer.API.InfoGamer

import com.google.gson.annotations.SerializedName


data class InfoGamerJogo(
    @SerializedName("nome") val nomeGamer: String,
    @SerializedName("email") val emailGamer: String,
    @SerializedName("dataNascimento") val dataNascimentoGamer: String,
    @SerializedName("usuario") val usuarioGamer: String
) {}
