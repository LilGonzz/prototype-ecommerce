package com.lilgonzz.prototypeecommerce.resources;

import com.lilgonzz.prototypeecommerce.domain.Categoria;
import com.lilgonzz.prototypeecommerce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;
    @GetMapping(value="/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Categoria obj =  service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
