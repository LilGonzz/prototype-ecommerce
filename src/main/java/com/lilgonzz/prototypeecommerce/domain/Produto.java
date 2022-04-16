package com.lilgonzz.prototypeecommerce.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Produto extends BaseDomain{

    private String nome;
    private Double preco;

    private Categoria categoria;

    public Produto(String nome, Double preco, Categoria categoria) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    public Produto(String nome, Double preco) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
        this.preco = preco;
    }

}
