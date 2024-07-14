package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto criarProduto(@RequestParam String nome, @RequestParam Double preco) {
        Produto produto = ProdutoFactory.criarProduto(nome, preco);
        return produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> getTodosProdutos() {
        return produtoRepository.findAll();
    }
}

