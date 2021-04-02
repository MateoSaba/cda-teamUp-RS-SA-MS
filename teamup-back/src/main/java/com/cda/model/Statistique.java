package com.cda.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Statistique {
	@Id
	private int idStatistique;
	
	private int nbButTotal;
	private int nbTitreMeilleurJoeur;
	private int nbTitrePireJoueur;
	private int nbVictoire;
	private int nbDefaite;
	private int nbMatchNul;
	
	@OneToMany
	@JoinColumn(name ="idJoueur")
	private Joueur joueur;

}
