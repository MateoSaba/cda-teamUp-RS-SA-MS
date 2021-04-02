package com.cda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Rencontre {
	@Id
	private int idRencontre;
	
	@Column(name = "date_match", nullable = false)
	private String dateMatch;
	
	private int score;
	private String resultat;
	
	@OneToOne
	@JoinColumn(name="idLieu")
	private Lieu lieu;


}
