package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Especialidade;
import br.com.medscan.medscan.model.Logradouro;

import java.io.Serializable;
import java.util.Objects;

public class LogradouroDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String bairro;
    private String cep;

    private CidadeDTO cidade;

    public LogradouroDTO(){
    }

    public LogradouroDTO(Integer id, String nome, String bairro, String cep, CidadeDTO cidade) {
        this.id = id;
        this.nome = nome;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public LogradouroDTO(Logradouro entity){
        id = entity.getId();
        nome = entity.getNome();
        bairro = entity.getBairro();
        cep = entity.getCep();
        cidade = new CidadeDTO(entity.getCidade());
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

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }
}
