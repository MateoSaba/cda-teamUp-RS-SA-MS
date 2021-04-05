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

	private int idEquipe;
	private String couleur;
	private int nbJoueur;
	private RencontreDto Rencontre;
}
