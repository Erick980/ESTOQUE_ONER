package com.oner.estoque.controller

import com.oner.estoque.model.Produto
import com.oner.estoque.service.ProdutoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/produtos")
class ProdutoController(private val produtoService: ProdutoService) {

    @GetMapping
    fun listar(): ResponseEntity<List<Produto>> = ResponseEntity.ok(produtoService.listarTodos())

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: String): ResponseEntity<Produto> =
        ResponseEntity.ok(produtoService.buscarPorId(id))

    @PostMapping
    fun criar(@RequestBody produto: Produto): ResponseEntity<Produto> =
        ResponseEntity.ok(produtoService.salvar(produto))

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: String): ResponseEntity<Void> {
        produtoService.deletar(id)
        return ResponseEntity.noContent().build()
    }
}
