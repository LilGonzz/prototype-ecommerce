package com.lilgonzz.prototypeecommerce.repositories;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>
{
}
