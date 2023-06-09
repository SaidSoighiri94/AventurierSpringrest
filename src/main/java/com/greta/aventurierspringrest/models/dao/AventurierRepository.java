package com.greta.aventurierspringrest.models.dao;

import com.greta.aventurierspringrest.models.entities.Aventurier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AventurierRepository extends JpaRepository<Aventurier, Long> {
    public List<Aventurier> findAventuriersByNomContaining(String nom);
}