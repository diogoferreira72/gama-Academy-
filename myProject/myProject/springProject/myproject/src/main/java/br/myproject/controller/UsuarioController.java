package br.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.myproject.dao.UsuarioDAO;
import br.myproject.dto.UsuarioDto;
import br.myproject.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {
    
     // anotação
     @Autowired
     // JPA cria classe a partir do UserDAO com todos os métodos, gerando objeto
     // "dao"
     // injeção de dependência
     private UsuarioDAO dao;
 
     // métodos - pedidos usuários e devolver
     @GetMapping("/all")
     public List<Usuario> listarTodos() {
         List<Usuario> lista = (List<Usuario>) dao.findAll();
         return lista;
     }

     @GetMapping("/id/{id}") // nome da variável = {id}
     public ResponseEntity<Usuario> buscaPorId(@PathVariable int id) { // igual ao nome acima - fazer correspondência
         // findbyid - retornar objeto
         // criar objeto "usuario" para receber
         // se não achou, move nullo
         Usuario usuario = dao.findById(id).orElse(null);
 
         if (usuario != null) {
             usuario.setPassword("*********"); // troca informação só de memória
             return ResponseEntity.ok(usuario); // 200 - achou e volta objeto
         } else {
             return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
         }
     }

     @PostMapping("/login")
      public ResponseEntity<UsuarioDto> login(@RequestBody Usuario usuario) {
        Usuario usuarioF = dao.findByEmailOrRacf(usuario.getEmail(), usuario.getRacf());

        if (usuarioF != null) {
            if (usuario.getPassword().equals(usuarioF.getPassword())) {
                UsuarioDto userDto = new UsuarioDto(usuarioF);
                return ResponseEntity.ok(userDto);
            } 
        }
        return ResponseEntity.status(401).build(); // Usuário e/ou Senha inválido!

    }

 
}
