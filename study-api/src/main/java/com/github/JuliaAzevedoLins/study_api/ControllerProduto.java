package com.github.JuliaAzevedoLins.study_api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    // public ResponseEntity<String> demo() {
    //     return ResponseEntity.status(203).body("Hello, World!");
    // }


    @PostMapping //criar
    public ResponseEntity<String> create(@RequestBody Produto produto) {
        return  ResponseEntity.status(201).body("Produto cadastrado: maçã");
    }

    @PutMapping //atualizazr
    public ResponseEntity<String> update() {
        return ResponseEntity.status(200).body("Produto atualizado: maçã");
    }

    @GetMapping //procurar
    public ResponseEntity<String> find() {
        return ResponseEntity.status(200).body("Produto encontrado: amora");
    }

    @DeleteMapping //apagar
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();
    }

}
