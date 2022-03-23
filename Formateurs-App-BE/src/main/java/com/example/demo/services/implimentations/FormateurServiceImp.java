package com.example.demo.services.implimentations;

import com.example.demo.models.Formateur;
import com.example.demo.repositories.FormateurRepository;
import com.example.demo.services.interfaces.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FormateurServiceImp implements FormateurService {

    @Autowired
    private FormateurRepository repository;


    @Override
    public Formateur create(Formateur formateur) {
        repository.save(formateur);
        return formateur;
    }

    @Override
    public Formateur update(long id, Formateur formateur) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Formateur> getAll() {
        return repository.findAll();
    }
}
