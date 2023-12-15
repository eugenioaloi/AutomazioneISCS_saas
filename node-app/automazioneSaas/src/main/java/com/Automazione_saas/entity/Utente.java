package com.Automazione_saas.entity;

import jakarta.persistence.*;

@Entity
@Table(name="utenti")
public class Utente {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_UTENTE")
	private int idUtente;
	
	@Column(name="NOME_UTENTE")
	private String nomeUtente;
	
	@Column(name="PASSWORD")
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
