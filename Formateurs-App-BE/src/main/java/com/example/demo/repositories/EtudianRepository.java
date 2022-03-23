package com.example.demo.repositories;

import com.example.demo.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudianRepository extends JpaRepository<Etudiant, Long> {
}
