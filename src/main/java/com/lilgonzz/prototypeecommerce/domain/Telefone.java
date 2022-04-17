package com.lilgonzz.prototypeecommerce.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Data
public class Telefone{

    private String numero;

    public Telefone(String numero){
        this.numero = numero;
    }
}
