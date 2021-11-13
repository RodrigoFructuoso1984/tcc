package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Especialidade;

import java.io.Serializable;

public class EspecialidadeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public EspecialidadeDTO(){
    }

    public EspecialidadeDTO(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public EspecialidadeDTO(Especialidade entity){
        id = entity.getId();
        nome = entity.getNome();
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

}
