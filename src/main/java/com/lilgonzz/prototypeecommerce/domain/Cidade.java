package com.lilgonzz.prototypeecommerce.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
public class Cidade extends BaseDomain{
    private String nome;
    //private Estado estado;

    public Cidade(String nome, Estado estado) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
        //this.estado = estado;
    }
}
