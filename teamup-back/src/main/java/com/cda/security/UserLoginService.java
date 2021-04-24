package com.cda.security;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cda.model.Joueur;
import com.cda.repository.IJoueurRepository;

@Service
public class UserLoginService implements UserDetailsService {
	
	@Autowired
	private IJoueurRepository joueurRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		if (username.trim().isEmpty()) {
			throw new UsernameNotFoundException("username is empty");
		} 
		Optional<Joueur> userOpt = this.joueurRepository.findByPseudo(username);
		if (!userOpt.isPresent()) {
			throw new UsernameNotFoundException("User " + username + " not found");
		}
		Joueur joueur = userOpt.get();		
		return new User(joueur.getPseudo(), joueur.getPassword(), List.of(new SimpleGrantedAuthority("JOUEUR")));
	}
}
