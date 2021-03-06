package com.example.demo.controllers;


import com.example.demo.models.Etudiant;
import com.example.demo.services.interfaces.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/create")
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant){
        return new ResponseEntity<>(etudiantService.create(etudiant), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Etudiant>> allEtudiant(){
        return new ResponseEntity<>(etudiantService.getAll(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Etudiant> updateEtudiant(@RequestBody Etudiant etudiant, @RequestParam String id){
        return new ResponseEntity<>(etudiantService.update(Long.parseLong(id), etudiant), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteEtudiant(@RequestParam String id){
        etudiantService.delete(Long.parseLong(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
