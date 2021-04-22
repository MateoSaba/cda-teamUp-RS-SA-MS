package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.StatistiqueDto;
import com.cda.model.Statistique;

@Mapper(componentModel = "spring")
public interface StatistiqueMapper {

	@Mapping(source="joueur.id", target = "idJoueur")
	StatistiqueDto StatistiqueToStatistiqueDto(Statistique statistique);
	
	@Mapping(source="idJoueur", target = "joueur.id")
	Statistique StatistiqueDtoToStatistique(StatistiqueDto statistiqueDto);
	
}
