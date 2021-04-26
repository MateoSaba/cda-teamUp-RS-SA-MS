package com.cda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.dto.JoueurDto;
import com.cda.service.JoueurService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class JoueurController {
	
private final JoueurService joueurService;
	
	@PostMapping()
	public ResponseEntity<JoueurDto> createJoueur(@RequestBody JoueurDto joueurDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(joueurService.save(joueurDto));
	}
	
	 @GetMapping()
	 public ResponseEntity<List<JoueurDto>> getAllJoueur() {
		 return ResponseEntity
				 .status(HttpStatus.OK)
	             .body(joueurService.getAll());
	 }
	 
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<JoueurDto> getJoueur(@PathVariable int id) {
		 return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(joueurService.getJoueur(id));
	 }
	 
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteJoueur(@PathVariable int id) {
	        return new ResponseEntity<>(joueurService.deleteJoueur(id),HttpStatus.OK);
	    }
	 
	 
	   @GetMapping("/page/{nPage}")
	    public ResponseEntity<List<JoueurDto>> getPageJoueur(@PathVariable int nPage) {
	        return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(joueurService.getPage(nPage));
	    }

}
