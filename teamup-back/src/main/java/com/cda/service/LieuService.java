package com.cda.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.LieuDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.LieuMapper;
import com.cda.model.Lieu;
import com.cda.repository.ILieuRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class LieuService {
	
	private final ILieuRepository lieuRepository;
	private final LieuMapper lieuMapper;

	@Transactional
	public LieuDto save(LieuDto lieuDto) {
		Lieu save = lieuRepository.save(lieuMapper.LieuDtoToLieu(lieuDto));
		lieuDto.setId(save.getId());
		return lieuDto;
	}
	
	@Transactional(readOnly =true)
	public List<LieuDto> getAll(){
		return lieuRepository.findAll()
				.stream()
				.map(lieuMapper :: LieuToLieuDto)
				.collect(toList());
		
	}
	
	@Transactional(readOnly =true)
	public LieuDto getLieu(int id){
		Lieu lieu = lieuRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucun lieu trouvée avec cet id"));
		return lieuMapper.LieuToLieuDto(lieu);
	}
	
	@Transactional
	public String deleteLieu(int id) {
		lieuRepository.deleteById(id);
		return "La suppression du lieu s'est effectuée avec succès!";
	}
	
	@Transactional(readOnly =true)
	public List<LieuDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 10, sort);
		return lieuRepository.findAll(pageable)
				.stream()
				.map(lieuMapper:: LieuToLieuDto)
				.collect(toList());
	}
   

}
