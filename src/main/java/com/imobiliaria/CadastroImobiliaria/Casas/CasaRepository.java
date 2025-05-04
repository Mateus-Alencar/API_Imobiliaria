package com.imobiliaria.CadastroImobiliaria.Casas;

import org.springframework.data.jpa.repository.JpaRepository;
// O JpaRepository fornece CRUD automático:
//  findAll() – busca todas as entidades
//  findById(Long id) – busca uma entidade por ID
//  save() – salva ou atualiza
//  deleteById() – deleta por ID
public interface CasaRepository extends JpaRepository<CasasModel, Long>{}
