package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.StatistiqueDto;
import com.cda.model.Statistique;

@Mapper(componentModel = "spring")
public interface StatistiqueMapper {

	@Mapping(source="joueur.idJoueur", target = "joueurId")
	StatistiqueDto StatistiqueToStatistiqueDto(Statistique statistique);
	
	@Mapping(source="joueurId", target = "joueur.idJoueur")
	Statistique StatistiqueDtoToStatistique(Statistique statistique);
	
}
