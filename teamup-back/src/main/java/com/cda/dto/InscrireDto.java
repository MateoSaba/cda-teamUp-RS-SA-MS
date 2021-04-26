package com.cda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InscrireDto {
	
	private int nbBut;
	private String meilleurJoueur;	
	private String pireJoueur;
	private EquipeDto equipe;

}
