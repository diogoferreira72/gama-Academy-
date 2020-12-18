package br.myproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.myproject.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

    // consulta por e-mail ou racf
    public Usuario findByEmailOrRacf(String email, char racf);
}

