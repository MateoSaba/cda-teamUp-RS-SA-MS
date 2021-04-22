package com.cda.service;

import org.springframework.stereotype.Service;

import com.cda.mapper.RencontreMapper;
import com.cda.repository.IRencontreRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RencontreService {
	
	private final IRencontreRepository iRencontreRepository;
	private final RencontreMapper rencontreMapper;

}
