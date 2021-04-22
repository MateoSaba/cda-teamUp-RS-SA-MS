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

import com.cda.dto.StatistiqueDto;
import com.cda.service.StatistiqueService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/statistique")
@AllArgsConstructor
public class StatistiqueController {
	
	private final StatistiqueService statistiqueService;
	
	@PostMapping()
	public ResponseEntity<StatistiqueDto> createStatistique(@RequestBody StatistiqueDto statistiqueDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(statistiqueService.save(statistiqueDto));	
		
	}
	@GetMapping()
	public ResponseEntity<List<StatistiqueDto>> getAllStatistiques(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(statistiqueService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StatistiqueDto> getStatistiqueById(@PathVariable int id){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(statistiqueService.getStatistique(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStatistique(@PathVariable int id){
		return new ResponseEntity<>(statistiqueService.deleteStatistique(id),HttpStatus.OK );
		
	}
	
	@GetMapping("/page/{nPage}")
    public ResponseEntity<List<StatistiqueDto>> getPageStatistique(@PathVariable int nPage) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(statistiqueService.getPage(nPage));
    }

}
