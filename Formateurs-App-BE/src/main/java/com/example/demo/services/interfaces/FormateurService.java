package com.example.demo.services.interfaces;

import com.example.demo.models.Etudiant;
import com.example.demo.models.Formateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormateurService {

    public Formateur create(Formateur formateur);
    public Formateur update(long id, Formateur formateur);
    public Formateur addEtidiant(long formateurId, Etudiant etudiant);
    public void delete(long id);
    public List<Formateur> getAll();


}
