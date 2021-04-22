package com.cda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lieu {
	@Id
	private int id;
	
	@Column(name = "ville", nullable = false)
	private String ville;
	
	private String nomTerrain;
	@ManyToOne
	@JoinColumn(name="idRencontre")
	private Rencontre rencontre;

}
