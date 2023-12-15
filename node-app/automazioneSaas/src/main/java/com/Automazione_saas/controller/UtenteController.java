package com.Automazione_saas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.Automazione_saas.bean.UtenteBean;
import com.Automazione_saas.service.UtenteService;

@Controller
@RequestMapping("/gestioneUtente")
@CrossOrigin(origins = "http://localhost:8081/login-demo")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path="/getUtente/{nomeUt}/{psw}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UtenteBean> getUtente(@PathVariable("nomeUt") String nomeUtente, 
													@PathVariable("psw") String password )
	{
		return new ResponseEntity<>(service.getUtente(nomeUtente, password), HttpStatus.OK);   
	}
	

}
