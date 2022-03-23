package com.example.demo.controllers;


import com.example.demo.models.Etudiant;
import com.example.demo.services.interfaces.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/create")
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant){
        return new ResponseEntity<>(etudiantService.create(etudiant), HttpStatus.CREATED);
    }
}
