package com.example.demo.services.interfaces;


import com.example.demo.models.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtudiantService {

    public Etudiant create(Etudiant etudiant);
    public Etudiant update(long id, Etudiant etudiant);
    public void delete(long id);
    public List<Etudiant> getAll();
}
