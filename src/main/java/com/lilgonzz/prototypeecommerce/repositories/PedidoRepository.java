package com.lilgonzz.prototypeecommerce.repositories;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import com.lilgonzz.prototypeecommerce.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>
{
}
