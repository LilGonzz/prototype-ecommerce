package com.lilgonzz.prototypeecommerce.services;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import com.lilgonzz.prototypeecommerce.repositories.CategoriaRepository;
import com.lilgonzz.prototypeecommerce.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;


    public Categoria find(Integer id){

       Optional<Categoria> obj =  repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: "+ id + " NOME: Categoria" ));
    }

}
