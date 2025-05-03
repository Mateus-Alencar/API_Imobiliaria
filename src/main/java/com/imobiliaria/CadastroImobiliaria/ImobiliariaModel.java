package com.imobiliaria.CadastroImobiliaria;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cadastro")
public class ImobiliariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String CNPJ;
    int telefone;
    String cidade;
    //Construtura vazio;
    public ImobiliariaModel(){}
    //Contrutor cheio
    public ImobiliariaModel(String nome, String CNPJ, int telefone, String cidade){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.cidade = cidade;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCNPJ() {return CNPJ;}
    public void setCNPJ(String CNPJ) {this.CNPJ = CNPJ;}
    public int getTelefone() {return telefone;}
    public void setTelefone(int telefone) {this.telefone = telefone;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}
}

// O próprio Java (via JPA) irá gerar automaticamente o ID para cada inserção no banco de dados,
// não sendo necessário informá-lo manualmente.