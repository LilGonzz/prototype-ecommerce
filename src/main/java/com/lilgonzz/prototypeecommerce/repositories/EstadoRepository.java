package com.lilgonzz.prototypeecommerce.repositories;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import com.lilgonzz.prototypeecommerce.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>
{
}
