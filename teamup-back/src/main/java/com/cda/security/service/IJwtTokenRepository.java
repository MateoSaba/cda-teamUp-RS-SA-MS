package com.cda.security.service;

import org.springframework.security.core.Authentication;

public interface IJwtTokenRepository {
	
    String createTokens(Authentication authentication);

	Authentication validateJwtToken(String bearerToken);

}
