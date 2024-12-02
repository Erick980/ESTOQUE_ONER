package com.oner.estoque.repository

import com.oner.estoque.model.Produto
import org.springframework.data.mongodb.repository.MongoRepository

interface ProdutoRepository : MongoRepository<Produto, String>
