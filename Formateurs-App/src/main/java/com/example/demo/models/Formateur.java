package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Uuid;
    private String nom;
    private String prenom;
    private String email;
    private String dateDeNaissance;
    private String gsm;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Etudiant.class)
   @JoinTable(name = "etudiants", joinColumns = { @JoinColumn(name = "id") })
    private List<Etudiant> etudiants;

    public Formateur(long id, String uuid, String nom, String prenom, String email, String dateDeNaissance, String gsm, List<Etudiant> etudiants) {
        this.id = id;
        Uuid = uuid;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.gsm = gsm;
        this.etudiants = etudiants;
    }

    public Formateur(String nom, String prenom, String email, String dateDeNaissance, String gsm) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.gsm = gsm;
    }

    public Formateur(String nom, String prenom, String email, String dateDeNaissance, String gsm, List<Etudiant> etudiants) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.gsm = gsm;
        this.etudiants = etudiants;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
