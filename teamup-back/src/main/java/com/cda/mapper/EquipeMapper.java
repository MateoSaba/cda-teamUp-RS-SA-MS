package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.EquipeDto;
import com.cda.model.Equipe;

@Mapper(componentModel = "spring")
public interface EquipeMapper {
	
	@Mapping(source="joueur.id", target = "idJoueur")
	@Mapping(source="rencontre.id", target = "idRencontre")
	EquipeDto EquipeToEquipeDto(Equipe equipe);
	
	@Mapping(source="idJoueur", target = "joueur.id")
	@Mapping(source="idRencontre", target = "rencontre.id")
	Equipe EquipeDtoToEquipe(EquipeDto equipeDto);

}
