package com.lilgonzz.prototypeecommerce.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Telefone{

    private String numero;

    public Telefone(String numero){
        this.numero = numero;
    }
}
