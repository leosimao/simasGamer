package com.br.simas.gamer.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> Gson.fromJsonId(stringJson: String): T
    =fromJson(stringJson, object : TypeToken<T>() {}.type)