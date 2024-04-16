package br.com.simao.simasgamer.modelo

import com.google.gson.annotations.SerializedName

data class Jogo (
    @SerializedName("title") val nomeJogo: String? = null,
    @SerializedName("thumb") val imagemJogo: String? = null
) {
    var descricaoJogo: String? = null
    override fun toString(): String {
        return "Nome do Jogo: ${nomeJogo} \n" +
                "Imagem: ${imagemJogo} \n" +
                "Descrição Jogo: ${descricaoJogo}"
    }
}