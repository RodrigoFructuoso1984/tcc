package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Especialidade;
import br.com.medscan.medscan.model.Estado;

import java.io.Serializable;

public class EstadoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String sigla;

    public EstadoDTO(){
    }

    public EstadoDTO(Integer id, String nome, String sigla){
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public EstadoDTO(Estado entity){
        id = entity.getId();
        nome = entity.getNome();
        sigla = entity.getSigla();
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
