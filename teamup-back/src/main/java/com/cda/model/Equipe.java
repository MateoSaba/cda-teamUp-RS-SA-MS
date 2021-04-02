package com.cda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipe;
	
	private String couleur;
	private int nbJoueur;
	
	@OneToMany
	@JoinColumn(name ="idJoeur")
	private Joueur joueur;
	
	@OneToOne
	@JoinColumn(name ="idRencontre")
	private Rencontre rencontre;

}
