package br.ferreira.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica classe controller do tipo REST
@CrossOrigin("*") // aceita pedidos de qualquer origem
@RequestMapping("/start") // padrão de requisição
public class Hello {

    @GetMapping("/hello") // método GET com uri '/hello'
    public String hello(){
        return "Hello world!";
    }
    
}
