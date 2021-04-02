package com.cda.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class JoeurEquipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJoueurEquipe;
	
	private int nbBut;
	private String meilleurJoueur;
	private String pireJoueur;
	
	@OneToMany
	@JoinColumn(name = "id_joueur")
	private Joueur joueur;
	
	@OneToMany
	@JoinColumn(name = "id_equipe")
	private Equipe equipe;
	
	

}
