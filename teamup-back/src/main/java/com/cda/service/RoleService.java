package com.cda.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.RoleDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.RoleMapper;
import com.cda.model.Role;
import com.cda.repository.IRoleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoleService {
	
	private IRoleRepository roleRepository;
	private RoleMapper roleMapper;
	
	@Transactional
	public RoleDto save (RoleDto roleDto) {
		Role save = roleRepository.save(roleMapper.RoleDtoToRole(roleDto));
		roleDto.setId(save.getId());
		return roleDto;
	}
	
	@Transactional(readOnly = true)
	public List<RoleDto> getAll(){
		return roleRepository.findAll()
				.stream()
				.map(roleMapper :: RoletoRoleDto)
				.collect(toList());
	}
	
	@Transactional(readOnly = true)
	public RoleDto getRoleById(int id) {
		Role role = roleRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucun role trouvé avec cet id! :" + id));
		return roleMapper.RoletoRoleDto(role);
	}
	
	@Transactional
	public String deleteRoleById(int id) {
		//TODO : Vérifier si l'id passé existe
		roleRepository.deleteById(id);
		return "La suppression du role s'est effectuée avec succès!!!";
	}
	
	@Transactional(readOnly =true)
	public List<RoleDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 10, sort);
		return roleRepository.findAll(pageable)
				.stream()
				.map(roleMapper:: RoletoRoleDto)
				.collect(toList());
	}
	
}