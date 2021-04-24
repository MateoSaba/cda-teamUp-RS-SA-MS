package com.cda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.model.Joueur;

public interface IJoueurRepository extends JpaRepository<Joueur, Integer> {
	
	Optional<Joueur> findByPseudoOrEmail (String pseudo, String email);
	
	Optional<Joueur> findByPseudo (String pseudo);

}
