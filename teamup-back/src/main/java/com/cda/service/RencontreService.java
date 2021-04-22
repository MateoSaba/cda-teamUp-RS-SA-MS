package com.cda.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.RencontreDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.RencontreMapper;
import com.cda.model.Rencontre;
import com.cda.repository.IRencontreRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RencontreService {
	
	private final IRencontreRepository rencontreRepository;
	private final RencontreMapper rencontreMapper;
	
	@Transactional
	public RencontreDto save (RencontreDto rencontreDto) {
		Rencontre save = rencontreRepository.save(rencontreMapper.RencontreDtoToRencontre(rencontreDto));
		rencontreDto.setId(save.getId());
		return rencontreDto;
	}
	
	
	@Transactional(readOnly =true)
	public List<RencontreDto> getAll(){
		return rencontreRepository.findAll()
				.stream()
				.map(rencontreMapper :: RencontreToRencontreDto)
				.collect(toList());
	}
	
	
	@Transactional(readOnly =true)
	public RencontreDto getRencontre(int id){
		Rencontre rencontre = rencontreRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucune rencontre trouvée avec cet id" + id));
		return rencontreMapper.RencontreToRencontreDto(rencontre);
	}
	
	
	@Transactional
	public String deleteRencontre(int id) {
		rencontreRepository.deleteById(id);
		return "La suppression de la rencontre s'est effectuée avec succès!";
	}
	
	
	@Transactional(readOnly =true)
	public List<RencontreDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 5, sort);
		return rencontreRepository.findAll(pageable)
				.stream()
				.map(rencontreMapper:: RencontreToRencontreDto)
				.collect(toList());
	}

}
