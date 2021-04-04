package com.cda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.model.Joueur;

public interface IJoueurRepository extends JpaRepository<Joueur, Integer> {

}
