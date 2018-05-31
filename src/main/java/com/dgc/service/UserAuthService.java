package com.dgc.service;

import org.springframework.security.core.context.SecurityContextHolder;

import com.dgc.security.UserSS;

public class UserAuthService {

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}