package com.lilgonzz.prototypeecommerce.domain;

import com.lilgonzz.prototypeecommerce.domain.Enum.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PagamentoCartao extends Pagamento{

    public Integer numeroParcelas;

    public PagamentoCartao(EstadoPagamento estado, Integer numeroParcelas, Pedido pedido) {
        super(estado, pedido);
        this.numeroParcelas = numeroParcelas;
    }
}
