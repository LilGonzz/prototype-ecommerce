package com.lilgonzz.prototypeecommerce.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
public class Categoria extends BaseDomain{

    private String nome;
    private List<Produto> list;

    public Categoria(String nome) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
    }
}