package dev.isagood.caiogg.klassics

import java.io.*

data class Klassic(
    val id: Long,
    val title: String,
    val description: String,
    val authorId: String,
    val fileName: String) : Serializable
