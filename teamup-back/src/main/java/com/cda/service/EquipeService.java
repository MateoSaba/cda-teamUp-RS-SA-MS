package com.cda.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.EquipeDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.EquipeMapper;
import com.cda.model.Equipe;
import com.cda.repository.IEquipeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EquipeService {
	
	private final IEquipeRepository equipeRepository;
	private final EquipeMapper equipeMapper;
	
	@Transactional
	public EquipeDto save(EquipeDto equipeDto) {
		Equipe save = equipeRepository.save(equipeMapper.EquipeDtoToEquipe(equipeDto));
		equipeDto.setId(save.getId());
		return equipeDto;
	}
	
	@Transactional(readOnly =true)
	public List<EquipeDto> getAll(){
		return equipeRepository.findAll()
				.stream()
				.map(equipeMapper :: EquipeToEquipeDto)
				.collect(toList());
		
	}
	
	@Transactional(readOnly =true)
	public EquipeDto getEquipe(int id){
		Equipe equipe = equipeRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucune équipe trouvée avec cet id"));
		return equipeMapper.EquipeToEquipeDto(equipe);
	}
	
	@Transactional
	public String deleteEquipe(int id) {
		equipeRepository.deleteById(id);
		return "La suppression de l'équipe s'est faite avec succès!";
	}
	
	@Transactional(readOnly =true)
	public List<EquipeDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 10, sort);
		return equipeRepository.findAll(pageable)
				.stream()
				.map(equipeMapper:: EquipeToEquipeDto)
				.collect(toList());
	}
	
	

}
