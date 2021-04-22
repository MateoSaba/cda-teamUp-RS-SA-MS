package com.cda.security.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cda.dto.StatistiqueDto;
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
		statistiqueDto.setIdStatistique(save.getIdStatistique());
		return statistiqueDto;
	}
	

}
