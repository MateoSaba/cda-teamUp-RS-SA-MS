package com.cda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.dto.EquipeDto;
import com.cda.service.EquipeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/equipe")
@AllArgsConstructor
public class EquipeController {
	
	private final EquipeService equipeService;
	
	@PostMapping()
	public ResponseEntity<EquipeDto> createEquipe(@RequestBody EquipeDto equipeDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(equipeService.save(equipeDto));	
		
	}
	@GetMapping()
	public ResponseEntity<List<EquipeDto>> getAllEquipe(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(equipeService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EquipeDto> getEquipeById(@PathVariable int id){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(equipeService.getEquipe(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEquipe(@PathVariable int id){
		return new ResponseEntity<>(equipeService.deleteEquipe(id),HttpStatus.OK );
		
	}
	
	@GetMapping("/page/{nPage}")
    public ResponseEntity<List<EquipeDto>> getPageEquipe(@PathVariable int nPage) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(equipeService.getPage(nPage));
    }
	
	

}
