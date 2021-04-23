package com.cda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

//Afin de définir les clés primaires composites, nous devons suivre certaines règles:
//
//La classe de clé primaire composite doit être publique
//Il doit avoir un constructeur sans argument
//Il doit définir les méthodes equals () et hashCode ()
//Il doit être S erializable

@Entity
@Data
@Builder
@Table(name="joueurEquipe")
@IdClass(JoueurEquipeId.class)
@EqualsAndHashCode(exclude= {"joueur", "equipe"})
@ToString(of = {"joueur", "equipe", "nbBut", "meilleurJoueur", "pireJoueur"})
public class JoueurEquipe implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@OneToMany
	@JoinColumn(name = "idJoueur")
	private Joueur joueur;
	
	@Id
	@OneToMany
	@JoinColumn(name = "idEquipe")
	private Equipe equipe;
	
	private int nbBut;
	private String meilleurJoueur;
	private String pireJoueur;
	
	public JoueurEquipe() {}
	
	public JoueurEquipe(Joueur joueur, Equipe equipe, int nbBut, String meilleurJoueur, String pireJoueur ) {
		this.joueur = joueur;
		this.equipe = equipe;
		this.nbBut = nbBut;
		this.meilleurJoueur = meilleurJoueur;
		this.pireJoueur = pireJoueur;
	}
	
	

}
