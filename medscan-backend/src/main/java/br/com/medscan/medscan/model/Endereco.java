package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String numeroEndereco;
    private String complementoEndereco;
    private String telefoneEndereco;

    @ManyToOne
    @JoinColumn(name = "logradouro_id")
    private Logradouro logradouro;

    @ManyToMany(mappedBy = "enderecos")
    private List<Profissional> profissionals = new ArrayList<>();

    public Endereco(){
    }

    public Endereco(Integer idEndereco, String numeroEndereco, String complementoEndereco, String telefoneEndereco, Logradouro logradouro) {
        this.idEndereco = idEndereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.telefoneEndereco = telefoneEndereco;
        this.logradouro = logradouro;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getTelefoneEndereco() {
        return telefoneEndereco;
    }

    public void setTelefoneEndereco(String telefoneEndereco) {
        this.telefoneEndereco = telefoneEndereco;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public List<Profissional> getProfissionals() {
        return profissionals;
    }

    public void setProfissionals(List<Profissional> profissionals) {
        this.profissionals = profissionals;
    }
}
