package com.example.demo.services.interfaces;

import com.example.demo.models.Formateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormateurService {

    public Formateur create(Formateur formateur);
    public Formateur update(long id, Formateur formateur);
    public Formateur delete(long id);
    public List<Formateur> getAll();

}
