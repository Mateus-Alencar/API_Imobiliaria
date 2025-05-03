package com.imobiliaria.CadastroImobiliaria.Imobiliarias;
import com.imobiliaria.CadastroImobiliaria.Casas.CasasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;  // Gera um construtor com todos os atributos da classe
import lombok.Data;                // Gera automaticamente getters, setters, toString, equals e hashCode
import lombok.NoArgsConstructor;   // Gera um construtor sem parâmetros (padrão)
import java.util.List;             // Import necessário para List

@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImobiliariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String CNPJ;
    private String telefone;  // Melhor usar String para números de telefone
    private String cidade;

    // Uma imobiliária pode ter várias casas
    @OneToMany(mappedBy = "imobiliaria")
    private List<CasasModel> casas;
}
