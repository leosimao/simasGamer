package com.br.simas.gamer.model.api.deserializer

import com.google.gson.annotations.SerializedName

data class DeserializerInfoJogoCheapShark(
    @SerializedName("info") val jogoCheapshark: DeserializerJogoCheapsShark
)
