package com.cda.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class JoueurEquipeId implements Serializable{

	private static final long serialVersionUID = 1L;
	private int equipe;
	private int joueur;
}
