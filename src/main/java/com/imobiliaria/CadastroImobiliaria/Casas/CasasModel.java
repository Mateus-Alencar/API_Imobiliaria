package com.imobiliaria.CadastroImobiliaria.Casas;
import com.imobiliaria.CadastroImobiliaria.Imobiliarias.ImobiliariaModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor; // Gera um construtor com todos os atributos da classe
import lombok.Data; // Gera automaticamente getters, setters, toString, equals e hashCode
import lombok.NoArgsConstructor; // Gera um construtor sem parâmetros (padrão)
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_casas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    private String bairro;
    private double valor;
    // @ManyToOne - uma casa para várias imobiliarias
    // @OneToMany - várias  casas para várias imobiliarias.
    @ManyToOne
    @JsonIgnore //O @JsonIgnore evita que o Jackson (biblioteca que transforma os objetos em JSON) tente serializar o campo imobiliaria de dentro de CasasModel. Isso quebra o ciclo e evita que a API fique se auto-referenciando.
    @JoinColumn(name = "imobiliarias_id") // Foreing Key - Chave estrangeira.
    private ImobiliariaModel imobiliaria;
}
