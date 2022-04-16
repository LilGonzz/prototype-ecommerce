package com.lilgonzz.prototypeecommerce.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Pedido extends BaseDomain{

    private LocalDateTime dataPedido;
    private Pagamento pagamento;
    private Endereco endereco;
    private Cliente cliente;

    public Pedido(LocalDateTime dataPedido, Pagamento pagamento, Cliente cliente, Endereco endereco){
        super(null, LocalDateTime.now(), null);
        this.dataPedido = dataPedido;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.endereco = endereco;
    }

}
