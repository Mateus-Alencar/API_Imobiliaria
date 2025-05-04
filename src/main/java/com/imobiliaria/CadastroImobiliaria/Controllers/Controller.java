package com.imobiliaria.CadastroImobiliaria.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.imobiliaria.CadastroImobiliaria.Casas.CasaService;
import com.imobiliaria.CadastroImobiliaria.Casas.CasasModel;

import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaService;
import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaModel;

import java.util.List;
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

    @Autowired
    private ImobiliariaService imobiliariaService;

    @GetMapping("/api/imobiliarias")
    public List<ImobiliariaModel> listarTodas() {
        return imobiliariaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ImobiliariaModel buscarPorId(@PathVariable Long id) {
        return imobiliariaService.buscarPorId(id);
    }

    @Autowired
    private CasaRepository casaRepository;

    @GetMapping("/api/casas")
    public List<CasasModel> listarTodas() {
        return CasaService.listarTodas();
    }

    @GetMapping("/casas/{id}")
    public CasasModel buscarPorId(@PathVariable Long id) {
        return CasaService.buscarPorId(id);
    }
}
