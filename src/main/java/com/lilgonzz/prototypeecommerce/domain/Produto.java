package com.lilgonzz.prototypeecommerce.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Produto extends BaseDomain{

    private String nome;
    private Double preco;

    @JsonBackReference
    @ManyToMany
    @JoinTable( name = "PRODUTO_CATEGORIA",
                joinColumns = @JoinColumn(name = "produto_id"),
                inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categoria = new ArrayList<>();

    public Produto(String nome, Double preco) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
        this.preco = preco;
    }

}
