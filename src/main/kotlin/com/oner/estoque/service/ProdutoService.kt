package com.oner.estoque.service

import com.oner.estoque.model.Produto
import com.oner.estoque.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val produtoRepository: ProdutoRepository) {

    fun listarTodos(): List<Produto> = produtoRepository.findAll()

    fun buscarPorId(id: String): Produto =
        produtoRepository.findById(id).orElseThrow { Exception("Produto não encontrado!") }

    fun salvar(produto: Produto): Produto = produtoRepository.save(produto)

    fun deletar(id: String) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id)
        } else {
            throw Exception("Produto não encontrado!")
        }
    }
}
