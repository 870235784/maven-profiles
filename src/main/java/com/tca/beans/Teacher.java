package com.tca.beans;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
	
	@Value("${test.username}")
	private String username;
	
	@Value("${test.password}")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
