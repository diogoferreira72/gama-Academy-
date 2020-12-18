package br.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.myproject.dao.AgenteDAO;
import br.myproject.model.Agente;

@RestController
@CrossOrigin("*")
@RequestMapping("/agente")
public class AgenteController {

    // anotação
    @Autowired
    // JPA cria classe a partir do UserDAO com todos os métodos, gerando objeto
    // "dao"
    // injeção de dependência
    private AgenteDAO dao;

    // métodos - pedidos usuários e devolver
    @GetMapping("/all")
    public List<Agente> listarTodos() {
        List<Agente> lista = (List<Agente>) dao.findAll();
        return lista;
    }
    
    // findby
    // data hora como string
    // order by desc
}
