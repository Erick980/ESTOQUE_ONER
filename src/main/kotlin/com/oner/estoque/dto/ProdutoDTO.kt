package com.oner.estoque.dto

data class ProdutoDTO(
    val id: String? = null,
    val nome: String,
    val descricao: String,
    val quantidade: Int,
    val preco: Double
)
