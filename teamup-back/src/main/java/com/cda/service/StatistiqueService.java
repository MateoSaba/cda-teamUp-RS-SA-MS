package com.cda.service;

import java.util.List;
import static java.util.stream.Collectors.toList;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.StatistiqueDto;
import com.cda.exception.PlatformException;
import com.cda.mapper.StatistiqueMapper;
import com.cda.model.Statistique;
import com.cda.repository.IStatistiqueRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatistiqueService {
	
	private final IStatistiqueRepository statistiqueRepository;
	private final StatistiqueMapper statistiqueMapper;
	
	@Transactional
	public StatistiqueDto save(StatistiqueDto statistiqueDto) {
		Statistique save = statistiqueRepository.save(statistiqueMapper.StatistiqueDtoToStatistique(statistiqueDto));
		statistiqueDto.setId(save.getId());
		return statistiqueDto;
	}
	
	@Transactional(readOnly =true)
	public List<StatistiqueDto> getAll(){
		return statistiqueRepository.findAll()
				.stream()
				.map(statistiqueMapper :: StatistiqueToStatistiqueDto)
				.collect(toList());
		
	}
	
	@Transactional(readOnly =true)
	public StatistiqueDto getStatistique(int id){
		Statistique statistique = statistiqueRepository.findById(id)
				.orElseThrow(()-> new PlatformException("Aucune Statistique trouvée avec cet id"));
		return statistiqueMapper.StatistiqueToStatistiqueDto(statistique);
	}
	
	@Transactional
	public String deleteStatistique(int id) {
		statistiqueRepository.deleteById(id);
		return "La suppression de la statistique s'est effectuée avec succès!";
	}
	
	@Transactional(readOnly =true)
	public List<StatistiqueDto> getPage (int nPage){
		Sort sort =null;
		sort = sort.by("id");
		sort  = sort.descending();
		Pageable pageable = PageRequest.of(nPage, 10, sort);
		return statistiqueRepository.findAll(pageable)
				.stream()
				.map(statistiqueMapper:: StatistiqueToStatistiqueDto)
				.collect(toList());
	}

}
