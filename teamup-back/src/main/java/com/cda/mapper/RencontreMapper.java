package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.RencontreDto;
import com.cda.model.Rencontre;

@Mapper(componentModel = "spring")
public interface RencontreMapper {
	
	@Mapping(source="lieu.id", target = "idLieu")
	RencontreDto RencontreToRencontreDto(Rencontre rencontre);
	
	@Mapping(source="idLieu", target = "lieu.id")
	Rencontre RencontreDtoToRencontre(RencontreDto rencontreDto);

}
