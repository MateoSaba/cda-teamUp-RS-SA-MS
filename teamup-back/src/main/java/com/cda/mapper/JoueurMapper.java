package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.JoueurDto;
import com.cda.model.Joueur;

@Mapper(componentModel = "spring")
public interface JoueurMapper {
	
	@Mapping(source="role.id", target = "idRole")
	@Mapping(source="statisitque.id", target = "idStatistique")
	JoueurDto JoueurToJoueurDto(Joueur joueur);
	
	@Mapping(source="idRole", target = "role.id")
	@Mapping(source="idStatistique", target = "statisitque.id")
	Joueur JoueurDtoToJoueur(JoueurDto joueurDto);

}
