package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Endereco;
import br.com.medscan.medscan.model.Especialidade;
import br.com.medscan.medscan.model.Profissional;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idEndereco;
    private String numeroEndereco;
    private String complementoEndereco;
    private String telefoneEndereco;

    private LogradouroDTO logradouroDTO;

    public EnderecoDTO(){
    }

    public EnderecoDTO(Integer idEndereco, String numeroEndereco, String complementoEndereco, String telefoneEndereco, LogradouroDTO logradouroDTO) {
        this.idEndereco = idEndereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.telefoneEndereco = telefoneEndereco;
        this.logradouroDTO = logradouroDTO;
    }

    public EnderecoDTO(Endereco entity) {
        idEndereco = entity.getIdEndereco();
        numeroEndereco = entity.getNumeroEndereco();
        complementoEndereco = entity.getComplementoEndereco();
        telefoneEndereco = entity.getTelefoneEndereco();
        logradouroDTO = new LogradouroDTO(entity.getLogradouro());
    }

    public Integer getId() {
        return idEndereco;
    }

    public void setId(Integer idEndereco) {
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

    public LogradouroDTO getLogradouroDTO() {
        return logradouroDTO;
    }

    public void setLogradouroDTO(LogradouroDTO logradouroDTO) {
        this.logradouroDTO = logradouroDTO;
    }
}
