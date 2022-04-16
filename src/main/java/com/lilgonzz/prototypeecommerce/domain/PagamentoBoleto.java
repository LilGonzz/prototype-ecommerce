package com.lilgonzz.prototypeecommerce.domain;

import com.lilgonzz.prototypeecommerce.domain.Enum.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
public class PagamentoBoleto extends Pagamento{

    private LocalDate dataVencimento;
    private LocalDate dataPagamento;

    public PagamentoBoleto(EstadoPagamento estado, LocalDate dataVencimento, LocalDate dataPagamento, Pedido pedido) {
        super(estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
