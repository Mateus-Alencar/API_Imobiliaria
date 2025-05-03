package com.imobiliaria.CadastroImobiliaria.Casas;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_casas")
public class CasasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    private String Bairro;
    private double valor;
    private ImobiliariaModel casa;
    // @ManyToOne - uma casa para várias imobiliarias
    // @OneToMany - várias  casas para várias imobiliarias.
    @ManyToOne
    @JoinColumn(name="imobiliarias_id"); // Foreing Key - Chave estrangeira.
    private ImobiliariaModel imobiliaria;
}
