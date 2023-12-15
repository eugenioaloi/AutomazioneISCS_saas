package com.Automazione_saas.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserError extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UserError(String msg) {
		super(msg);
	}

}
