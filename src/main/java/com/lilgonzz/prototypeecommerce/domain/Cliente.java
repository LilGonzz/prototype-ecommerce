package com.lilgonzz.prototypeecommerce.domain;

import com.lilgonzz.prototypeecommerce.domain.Enum.TipoCliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Cliente extends BaseDomain{

    private String nome;
    private String email;
    private String documento;
    private TipoCliente tipo;
    private List<Pedido> pedidos;

    private List<Telefone> telefone;

    public Cliente(String nome, String email, String documento, TipoCliente tipo, List<Telefone> telefone){
        super(null, LocalDateTime.now(), null);
        this.nome=nome;
        this.email=email;
        this.documento=documento;
        this.tipo=tipo;
        this.telefone = telefone;
        this.pedidos = new ArrayList<Pedido>();
    }
}
