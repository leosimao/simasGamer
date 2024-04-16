package br.com.simao.simasgamer.modelo

import com.google.gson.annotations.SerializedName

class InfoJogo(@SerializedName("info") val infoJogo: Jogo) {
    override fun toString(): String {
        return infoJogo.toString()
    }
}