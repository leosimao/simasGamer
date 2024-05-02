package br.com.simao.simasgamer.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> Gson.fromListJson(stringJson: String): List<T>
    =fromJson(stringJson, object : TypeToken<List<T>>() {}.type)

inline fun <reified T> Gson.fromJson(stringJson: String)
    =fromJson<T>(stringJson, object: TypeToken<T>() {}.type)