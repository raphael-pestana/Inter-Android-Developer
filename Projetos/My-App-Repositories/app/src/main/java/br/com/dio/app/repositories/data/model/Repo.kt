package br.com.dio.app.repositories.data.model

data class Repo(
    val id: Long,
    val name: String,
    val stargazersCount: Long,
    val language: String,
    val htmlURL: String,
    val description: String
)
