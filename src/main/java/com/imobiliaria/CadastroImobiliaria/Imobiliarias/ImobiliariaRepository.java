package com.imobiliaria.CadastroImobiliaria.Imobiliarias;

import org.springframework.data.jpa.repository.JpaRepository;

// O JpaRepository fornece CRUD automático:
//  findAll() – busca todas as entidades
//  findById(Long id) – busca uma entidade por ID
//  save() – salva ou atualiza
//  deleteById() – deleta por ID

public interface ImobiliariaRepository extends JpaRepository<ImobiliariaModel, Long>{}