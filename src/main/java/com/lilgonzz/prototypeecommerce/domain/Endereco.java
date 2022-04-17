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
public class Endereco extends BaseDomain{
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    //private Cidade cidade;

    public Endereco(String logadouro, String numero, String complemento, String bairro, String cep, Cidade cidade) {
        super(null, LocalDateTime.now(),null);
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        //this.cidade = cidade;
    }
}
