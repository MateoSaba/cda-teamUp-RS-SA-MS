package com.cda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatistiqueDto {
	private int idStatistique;
	private int nbButTotal;
	private int nbTitreMeilleurJoeur;
	private int nbTitrePireJoueur;
	private int nbVictoire;
	private int nbDefaite;
	private int nbMatchNul;
	private int idJoueur;
}
