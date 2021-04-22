package com.cda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RencontreDto {
	private int id;
	private String dateMatch;
	private int score;
	private String resultat;
	private int idLieu;
}
