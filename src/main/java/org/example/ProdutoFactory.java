package org.example;

public class ProdutoFactory {
    public static Produto criarProduto(String nome, Double preco) {
        return new Produto(nome, preco);
    }
}

