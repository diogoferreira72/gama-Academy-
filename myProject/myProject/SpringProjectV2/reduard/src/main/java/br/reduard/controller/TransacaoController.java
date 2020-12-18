package br.reduard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.reduard.dao.TransacaoDAO;
import br.reduard.dto.ContagemStatusDto;
import br.reduard.model.Transacao;

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

         // chamada Count
/*           @GetMapping("/total/{id}")
         public ResponseEntity<List<ContagemStatusDto>> contagemStatus(@PathVariable int id) {
             List<ContagemStatusDto> contagem = dao.countStatusByAgent(id);
             if(contagem != null){
                 return ResponseEntity.ok(contagem);
             }
             return ResponseEntity.notFound().build(); // http response 404
         }  */

    @GetMapping("/id/{id}") // nome da variável = {id}
    public ResponseEntity<List<ContagemStatusDto>> contagemStatus(@PathVariable int id) { // igual ao nome acima - fazer correspondência
        // findbyid - retornar objeto
        // criar objeto "user" para receber
        // se não achou, move nullo
        List<ContagemStatusDto>  contagem = dao.countStatusByAgent(id); //??? .orElse(null);

        if (contagem != null) {
            return ResponseEntity.ok(contagem); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }

}
