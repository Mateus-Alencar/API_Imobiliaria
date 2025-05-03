package com.imobiliaria.CadastroImobiliaria.Imobiliarias;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController -> É uma anotação que transforma a classe em uma API que responde com dados (JSON),
// em vez de páginas da web.
@RestController

//A anotação @RequestMapping no Spring serve para mapear requisições HTTP para 
// métodos ou classes do código.
@RequestMapping
public class Controller {
    //GetMapping --> Puxar informações
    //PostMapping --> Mandar informações
    //PutMapping --> Alterar informações
    //PatchMapping --> Alterar informações
    //DeleteMapping --> Deletar informações

    @GetMapping("msg")
    public String msg(){
        return "Imobiliaria - API";
    }
}
