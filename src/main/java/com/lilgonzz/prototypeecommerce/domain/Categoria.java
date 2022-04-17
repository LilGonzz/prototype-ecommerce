package com.lilgonzz.prototypeecommerce.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Categoria extends BaseDomain{

    private String nome;
    @JsonManagedReference
    @ManyToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(String nome) {
        super(null, LocalDateTime.now(), null);
        this.nome = nome;
    }
}
