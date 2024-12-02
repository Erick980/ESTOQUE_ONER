package com.oner.estoque.repository

import com.oner.estoque.model.Movimentacao
import org.springframework.data.mongodb.repository.MongoRepository

interface MovimentacaoRepository : MongoRepository<Movimentacao, String>
