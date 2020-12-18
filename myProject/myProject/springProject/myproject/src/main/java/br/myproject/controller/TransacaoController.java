package br.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.myproject.dao.TransacaoDAO;
import br.myproject.model.Transacao;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class TransacaoController {

     // anotação
     @Autowired
     // JPA cria classe a partir do UserDAO com todos os métodos, gerando objeto
     // "dao"
     // injeção de dependência
     private TransacaoDAO dao;
 
     // métodos - pedidos usuários e devolver
     @GetMapping("/all")
     public List<Transacao> listarTodos() {
         List<Transacao> lista = (List<Transacao>) dao.findAll();
         return lista;
     }
    
     @GetMapping("/id/{id}") 
     public ResponseEntity<Transacao> buscaPorId(@PathVariable int id) { 
         Transacao transacao = dao.findById(id).orElse(null);
 
         if (transacao != null) {
             return ResponseEntity.ok(transacao); // 200 - achou e volta objeto
         } else {
             return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
         }
     }


      // GET para nova busca com Select na mão ?!?
    @GetMapping("/idO/{id}")
    public ResponseEntity<Transacao> buscarPersonalizado(@PathVariable int id) {
        Transacao transacaoPersonalizada = dao.buscaPorId(id);
        if (transacaoPersonalizada != null) {
            return ResponseEntity.ok(transacaoPersonalizada); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }
    /* ?!?
     * exemplo de retorno: { "id": 0, "name": "Bruce Wayne", "email":
     * "bruce.wayne@aol.com", "cpf": null, "password": null, "anuncios": null }
     */

    // GET para nova busca com Select NATIVO na mão ?!?
    @GetMapping("/idN/{id}")
    public ResponseEntity<Object> buscarPersonalizadoN(@PathVariable int id) {
        Object transacaoPersonalizada = dao.buscaPorIdN(id);
        if (transacaoPersonalizada != null) {
            return ResponseEntity.ok(transacaoPersonalizada); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }
    /* ?!?
     * exemplo de retorno: "Bruce Wayne", "bruce.wayne@aol.com"
     */
}
