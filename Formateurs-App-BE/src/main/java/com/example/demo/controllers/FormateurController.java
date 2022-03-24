package com.example.demo.controllers;


import com.example.demo.models.Etudiant;
import com.example.demo.models.Formateur;
import com.example.demo.services.interfaces.EtudiantService;
import com.example.demo.services.interfaces.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formateurs")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @PostMapping("/create")
    public ResponseEntity<Formateur> createFormateur(@RequestBody Formateur formateur){
        return new ResponseEntity<>(formateurService.create(formateur), HttpStatus.CREATED);
    }

    @PostMapping("/addEtudiant")
    public ResponseEntity<Formateur> addEtidiant(@RequestParam String formateurId, @RequestBody Etudiant etudiant) {
        return new ResponseEntity<>(formateurService.addEtidiant(Long.parseLong(formateurId), etudiant), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Formateur>> allFormateur(){
        return new ResponseEntity<>(formateurService.getAll(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Formateur> updateFormateur(@RequestBody Formateur formateur, @RequestParam String id){
        return new ResponseEntity<>(formateurService.update(Long.parseLong(id), formateur), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteFormateur(@RequestParam String id){
        formateurService.delete(Long.parseLong(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
