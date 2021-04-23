package com.cda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipeDto {

	private int id;
	private String couleur;
	private int nbJoueur;
<<<<<<< HEAD
	private String joueur;
	private int rencontre;
=======
	private int idJoueur;
>>>>>>> 5ea14a1 (ajout CRUD Equipe)
}
