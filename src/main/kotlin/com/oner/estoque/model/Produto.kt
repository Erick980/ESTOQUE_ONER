package com.oner.estoque.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "produtos")
data class Produto(
    @Id val id: String? = null,
    val nome: String,
    val descricao: String,
    val quantidade: Int,
    val preco: Double
)
