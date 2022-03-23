package com.example.demo.services.implimentations;

import com.example.demo.Utils.Utils;
import com.example.demo.models.Etudiant;
import com.example.demo.repositories.EtudianRepository;
import com.example.demo.services.interfaces.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImp implements EtudiantService {

    @Autowired
    private EtudianRepository repository;


    @Override
    public Etudiant create(Etudiant etudiant) {
        etudiant.setUuid(Utils.generateUserId(16));
        repository.save(etudiant);
        return etudiant;
    }


    @Override
    public Etudiant update(long id, Etudiant etudiant) {
        Etudiant oldEtudiant = repository.findById(id).get();
        oldEtudiant.setNom(etudiant.getNom());
        oldEtudiant.setPrenom(etudiant.getPrenom());
        oldEtudiant.setEmail(etudiant.getEmail());
        oldEtudiant.setDateDeNaissance(etudiant.getDateDeNaissance());
        oldEtudiant.setGsm(etudiant.getGsm());

        repository.save(oldEtudiant);

        return oldEtudiant;
    }

    @Override
    public void delete(long id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public List<Etudiant> getAll() {
        return repository.findAll();
    }
}
