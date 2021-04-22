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

import com.cda.dto.RencontreDto;
import com.cda.service.RencontreService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/rencontre")
@AllArgsConstructor
public class RencontreController {
	
	private final RencontreService rencontreService;
	
	@PostMapping()
	public ResponseEntity<RencontreDto> createRencontre(@RequestBody RencontreDto rencontreDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(rencontreService.save(rencontreDto));
	}
	
	 @GetMapping()
	 public ResponseEntity<List<RencontreDto>> getAllRencontre() {
		 return ResponseEntity
				 .status(HttpStatus.OK)
	             .body(rencontreService.getAll());
	 }
	 
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<RencontreDto> getRencontre(@PathVariable int id) {
		 return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(rencontreService.getRencontre(id));
	 }
	 
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteRencontre(@PathVariable int id) {
	        return new ResponseEntity<>(rencontreService.deleteRencontre(id),HttpStatus.OK);
	    }
	 
	 
	   @GetMapping("/page/{nPage}")
	    public ResponseEntity<List<RencontreDto>> getPageRencontre(@PathVariable int nPage) {
	        return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(rencontreService.getPage(nPage));
	    }
	 
}
