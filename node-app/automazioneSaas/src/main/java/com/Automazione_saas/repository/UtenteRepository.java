package com.Automazione_saas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Automazione_saas.entity.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Integer> {
	
	@Query("select u from Utente u where nomeUtente=:nomeUt and password=:psw")
	Utente getCurrentUtente(@Param("nomeUt") String nomeUt,@Param("psw") String psw);

}
