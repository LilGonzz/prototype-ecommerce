package com.lilgonzz.prototypeecommerce.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Estado extends BaseDomain{

    private String nome;
    //private List<Cidade> cidades;

    public Estado(String nome) {
        super(null, LocalDateTime.now(),null);
        this.nome = nome;
        //this.cidades = new ArrayList<>();
    }
}
