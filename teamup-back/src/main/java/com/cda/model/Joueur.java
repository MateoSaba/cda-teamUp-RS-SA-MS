package com.cda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String postePrefere;

	@OneToOne
	@JoinColumn(name ="idRole")
	private Role role;
	
	@OneToOne
	@JoinColumn(name ="idStatistique")
	private Statistique statisitque;
	
	@ManyToMany
	@JoinColumn(name ="equipe")
	private Equipe equipe;
}
