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

import com.cda.dto.RoleDto;
import com.cda.service.RoleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/role")
@AllArgsConstructor
public class RoleController {
	
	private RoleService roleService;
	
	@PostMapping()
	public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(roleService.save(roleDto));	
		
	}
	@GetMapping()
	public ResponseEntity<List<RoleDto>> getAllRoles(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(roleService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RoleDto> getRoleById(@PathVariable int id){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(roleService.getRoleById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRole(@PathVariable int id){
		return new ResponseEntity<>(roleService.deleteRoleById(id),HttpStatus.OK );
		
	}
	
	@GetMapping("/page/{nPage}")
    public ResponseEntity<List<RoleDto>> getPageRole(@PathVariable int nPage) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(roleService.getPage(nPage));
    }

}
