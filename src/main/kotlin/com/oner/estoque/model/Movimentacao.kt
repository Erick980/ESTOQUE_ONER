package com.oner.estoque.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "movimentacoes")
data class Movimentacao(
    @Id val id: String? = null,
    val tipo: String, // Entrada ou Saída
    val produtoId: String,
    val quantidade: Int,
    val data: LocalDateTime = LocalDateTime.now()
)
