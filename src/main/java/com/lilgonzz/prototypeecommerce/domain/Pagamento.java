package com.lilgonzz.prototypeecommerce.domain;

import com.lilgonzz.prototypeecommerce.domain.Enum.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public abstract class Pagamento extends BaseDomain{

    private EstadoPagamento estado;
    private Pedido pedido;

    public Pagamento(EstadoPagamento estado, Pedido pedido) {
        super(null, LocalDateTime.now(), null);
        this.estado = estado;
        this.pedido = pedido;
    }
}
