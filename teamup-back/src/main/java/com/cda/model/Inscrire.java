package com.cda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="joueur_equipe")
@IdClass(JoueurEquipeId.class)
@EqualsAndHashCode(exclude= {"joueur", "equipe"})
public class Inscrire implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idJoueur")
	private Joueur joueur;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idEquipe")
	private Equipe equipe;
	
	private int nbBut;
	private String meilleurJoueur;	
	private String pireJoueur;
	

}
