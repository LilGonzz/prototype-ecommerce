package com.lilgonzz.prototypeecommerce.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Cidade extends BaseDomain{
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
        this.estado = estado;
    }
}
