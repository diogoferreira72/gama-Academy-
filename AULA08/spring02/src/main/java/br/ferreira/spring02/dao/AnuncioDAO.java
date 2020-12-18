package br.ferreira.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.ferreira.spring02.model.Anuncio;

public interface AnuncioDAO extends CrudRepository <Anuncio, Integer>{

        
}
