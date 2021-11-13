package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Cidade;
import br.com.medscan.medscan.model.Profissional;

import java.io.Serializable;

public class CidadeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    private EstadoDTO estado;

    public CidadeDTO(){
    }

    public CidadeDTO(Integer id, String nome, EstadoDTO estado){
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public CidadeDTO(Cidade entity){
        id = entity.getId();
        nome = entity.getNome();
        estado = new EstadoDTO(entity.getEstado());
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

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }
}
