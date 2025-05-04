package com.imobiliaria.CadastroImobiliaria.Services;

import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaModel;
import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImobiliariaService {

    @Autowired
    private ImobiliariaRepository imobiliariaRepository;

    public List<ImobiliariaModel> listarTodas() {
        return imobiliariaRepository.findAll();
    }

    public ImobiliariaModel buscarPorId(Long id) {
        return imobiliariaRepository.findById(id).orElse(null);
    }
}
