package com.lilgonzz.prototypeecommerce.domain;

import com.lilgonzz.prototypeecommerce.domain.Enum.EstadoPagamento;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public abstract class Pagamento extends BaseDomain{

    private EstadoPagamento estado;
    private Pedido pedido;

    public Pagamento(EstadoPagamento estado, Pedido pedido) {
        super(null, LocalDateTime.now(), null);
        this.estado = estado;
        this.pedido = pedido;
    }
}
