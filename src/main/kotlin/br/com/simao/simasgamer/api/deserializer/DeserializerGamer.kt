package br.com.simao.simasgamer.api.deserializer

import com.google.gson.annotations.SerializedName


data class DeserializerGamer(
    @SerializedName("nome") val nomeGamer: String,
    @SerializedName("email") val emailGamer: String,
    @SerializedName("dataNascimento") val dataNascimentoGamer: String,
    @SerializedName("usuario") val usuarioGamer: String
) {}
