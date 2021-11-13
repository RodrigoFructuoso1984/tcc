package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "logradouro")
public class Logradouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String bairro;
    private String cep;

    @OneToMany(mappedBy = "logradouro")
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    public Logradouro(){
    }

    public Logradouro(Integer id, String nome, String bairro, String cep, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
