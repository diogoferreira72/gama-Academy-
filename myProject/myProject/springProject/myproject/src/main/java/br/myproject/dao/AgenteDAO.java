package br.myproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.myproject.model.Agente;

public interface AgenteDAO extends CrudRepository<Agente, Integer>{
    
}
