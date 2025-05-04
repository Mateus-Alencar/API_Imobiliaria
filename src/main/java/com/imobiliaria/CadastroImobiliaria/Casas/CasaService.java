package com.imobiliaria.CadastroImobiliaria.Casas;

import com.imobiliaria.CadastroImobiliaria.Casas.CasasModel;
import com.imobiliaria.CadastroImobiliaria.Casas.CasaRepository;
import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;
    public List<CasasModel> listarTodas() {
        return casaRepository.findAll();
    }
    public CasasModel buscarPorId(Long id) {
        return casaRepository.findById(id).orElse(null);
    }
}
