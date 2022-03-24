package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Uuid;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    private Date dateDeNaissance;
    @Column(unique = true)
    private String gsm;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Etudiant.class)
   @JoinColumn(name = "classe", referencedColumnName = "id")
    private List<Etudiant> etudiants;

    public Formateur() {
    }

    public Formateur(long id, String uuid, String nom, String prenom, String email, Date dateDeNaissance, String gsm, List<Etudiant> etudiants) {
        this.id = id;
        Uuid = uuid;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.gsm = gsm;
        this.etudiants = etudiants;
    }

    public Formateur(String nom, String prenom, String email, Date dateDeNaissance, String gsm) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.gsm = gsm;
    }

    public Formateur(String nom, String prenom, String email, Date dateDeNaissance, String gsm, List<Etudiant> etudiants) {
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

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
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
