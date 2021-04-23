package com.cda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cda.dto.RoleDto;
import com.cda.model.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
	@Mapping(source="joueur.id", target = "idJoueur")
	RoleDto RoletoRoleDto (Role role);
	
	@Mapping(source="idJoueur", target = "joueur.id")
	Role RoleDtoToRole (RoleDto roleDto);

}
