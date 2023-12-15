package com.Automazione_saas.bean;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;

public class UtenteBean {
	
	@JsonInclude(Include.NON_NULL)
	private int idUtente;
	
	@JsonInclude(Include.NON_NULL)
	private String nomeUtente;
	
	@JsonInclude(Include.NON_NULL)
	private String password;

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
