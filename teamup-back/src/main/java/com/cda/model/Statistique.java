package com.cda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Statistique {
	@Id
	private int id;
	
	private int nbButTotal;
	private int nbTitreMeilleurJoeur;
	private int nbTitrePireJoueur;
	private int nbVictoire;
	private int nbDefaite;
	private int nbMatchNul;
	
	@ManyToOne
	@JoinColumn(name ="idJoueur")
	private Joueur joueur;

}
