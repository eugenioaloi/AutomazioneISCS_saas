package com.Automazione_saas.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Automazione_saas.bean.UtenteBean;
import com.Automazione_saas.entity.Utente;
import com.Automazione_saas.errors.UserError;
import com.Automazione_saas.repository.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository repo;
	
	public UtenteBean getUtente(String nomeUt, String psw) {
		UtenteBean bean = new UtenteBean();
		Utente ut = repo.getCurrentUtente(nomeUt, psw);
		if(ut!=null) {
			BeanUtils.copyProperties(ut, bean);
			return bean;
		}
		else throw new UserError("Utente non trovato");
	}
	
	
	
	

}
