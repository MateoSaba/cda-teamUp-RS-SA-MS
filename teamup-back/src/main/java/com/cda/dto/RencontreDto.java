package com.cda.dto;

import com.cda.model.Lieu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RencontreDto {
	private int idRencontre;
	private String dateMatch;
	private int score;
	private String resultat;
	private LieuDto lieu;
}
