package com.lilgonzz.prototypeecommerce.repositories;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import com.lilgonzz.prototypeecommerce.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>
{
}
