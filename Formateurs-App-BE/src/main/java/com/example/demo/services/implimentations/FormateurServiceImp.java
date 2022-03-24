package com.example.demo.services.implimentations;

import com.example.demo.Utils.Utils;
import com.example.demo.models.Etudiant;
import com.example.demo.models.Formateur;
import com.example.demo.repositories.FormateurRepository;
import com.example.demo.services.interfaces.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormateurServiceImp implements FormateurService {

    @Autowired
    private FormateurRepository repository;


    @Override
    public Formateur create(Formateur formateur) {
        formateur.setUuid(Utils.generateUserId(16));
        repository.save(formateur);
        return formateur;
    }

    @Override
    public Formateur update(long id, Formateur formateur) {
        Formateur oldFormateur = repository.findById(id).get();
        oldFormateur.setNom(formateur.getNom());
        oldFormateur.setPrenom(formateur.getPrenom());
        oldFormateur.setEmail(formateur.getEmail());
        oldFormateur.setDateDeNaissance(formateur.getDateDeNaissance());
        oldFormateur.setGsm(formateur.getGsm());
        oldFormateur.setEtudiants(formateur.getEtudiants());

        repository.save(oldFormateur);

        return oldFormateur;

    }

    @Override
    public void delete(long id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public List<Formateur> getAll() {
        return repository.findAll();
    }
}
