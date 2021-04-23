package com.cda.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.JoueurDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.JoueurMapper;
import com.cda.model.Joueur;
import com.cda.repository.IJoueurRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JoueurService {
	
	private final IJoueurRepository joueurRepository;
	private final JoueurMapper joueurMapper;
	
	@Transactional
	public JoueurDto save (JoueurDto joueurDto) {
		Joueur save = joueurRepository.save(joueurMapper.JoueurDtoToJoueur(joueurDto));
		joueurDto.setId(save.getId());
		return joueurDto;
	}
	
	@Transactional(readOnly =true)
	public List<JoueurDto> getAll(){
		return joueurRepository.findAll()
				.stream()
				.map(joueurMapper :: JoueurToJoueurDto)
				.collect(toList());
	}
	
	
	@Transactional(readOnly =true)
	public JoueurDto getJoueur(int id){
		Joueur joueur = joueurRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucun joueur trouvée avec cet id" + id));
		return joueurMapper.JoueurToJoueurDto(joueur);
	}
	
	
	@Transactional
	public String deleteJoueur(int id) {
		joueurRepository.deleteById(id);
		return "La suppression du joueur s'est effectué avec succès!";
	}
	
	
	@Transactional(readOnly =true)
	public List<JoueurDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 5, sort);
		return joueurRepository.findAll(pageable)
				.stream()
				.map(joueurMapper:: JoueurToJoueurDto)
				.collect(toList());
	}

	
	
	

}
