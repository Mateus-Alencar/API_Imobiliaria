package com.imobiliaria.CadastroImobiliaria.Casas;
import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor; // Gera um construtor com todos os atributos da classe
import lombok.Data; // Gera automaticamente getters, setters, toString, equals e hashCode
import lombok.NoArgsConstructor; // Gera um construtor sem parâmetros (padrão)

@Entity
@Table (name = "tb_casas")
public class CasasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    private String Bairro;
    private double valor;
    // @ManyToOne - uma casa para várias imobiliarias
    // @OneToMany - várias  casas para várias imobiliarias.
    @ManyToOne
    @JoinColumn(name="imobiliarias_id") // Foreing Key - Chave estrangeira.
    private ImobiliariaModel imobiliaria;
}
