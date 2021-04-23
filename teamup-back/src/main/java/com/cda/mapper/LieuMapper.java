package com.cda.mapper;

import org.mapstruct.Mapper;

import com.cda.dto.LieuDto;
import com.cda.model.Lieu;

@Mapper(componentModel = "spring")
public interface LieuMapper {
	
	LieuDto LieuToLieuDto(Lieu lieu);
	
	Lieu LieuDtoToLieu(LieuDto lieuDto);

}
