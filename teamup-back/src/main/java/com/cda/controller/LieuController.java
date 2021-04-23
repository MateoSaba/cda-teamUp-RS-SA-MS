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

import com.cda.dto.LieuDto;
import com.cda.service.LieuService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/lieu")
@AllArgsConstructor
public class LieuController {
	
	private final LieuService lieuService;
	
	@PostMapping()
	public ResponseEntity<LieuDto> createLieu(@RequestBody LieuDto lieuDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(lieuService.save(lieuDto));
	}
	
	 @GetMapping()
	 public ResponseEntity<List<LieuDto>> getAllLieu() {
		 return ResponseEntity
				 .status(HttpStatus.OK)
	             .body(lieuService.getAll());
	 }
	
	
	
	
	 @GetMapping("/{id}")
	 public ResponseEntity<LieuDto> getLieu(@PathVariable int id) {
		 return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(lieuService.getLieu(id));
	 }
	 
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteLieu(@PathVariable int id) {
	        return new ResponseEntity<>(lieuService.deleteLieu(id),HttpStatus.OK);
	    }
	 
	 
	   @GetMapping("/page/{nPage}")
	    public ResponseEntity<List<LieuDto>> getPageLieu(@PathVariable int nPage) {
	        return ResponseEntity
	                .status(HttpStatus.OK)
	                .body(lieuService.getPage(nPage));
	    }
	

}
