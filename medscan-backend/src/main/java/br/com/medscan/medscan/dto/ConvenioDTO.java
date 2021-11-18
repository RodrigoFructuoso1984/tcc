package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Convenio;
import br.com.medscan.medscan.model.Profissional;

import java.io.Serializable;

public class ConvenioDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idConvenio;
    private String nomeConvenio;

    private ProfissionalDTO profissionalDTO;

    public ConvenioDTO(){
    }

    public ConvenioDTO(Integer idConvenio, String nomeConvenio, ProfissionalDTO profissionalDTO) {
        this.idConvenio = idConvenio;
        this.nomeConvenio = nomeConvenio;
        this.profissionalDTO = profissionalDTO;
    }

    public ConvenioDTO(Convenio entity){
        idConvenio = entity.getIdConvenio();
        nomeConvenio = entity.getNomeConvenio();
        profissionalDTO = new ProfissionalDTO();
    }

    public Integer getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(Integer idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public ProfissionalDTO getProfissionalDTO() {
        return profissionalDTO;
    }

    public void setProfissionalDTO(ProfissionalDTO profissionalDTO) {
        this.profissionalDTO = profissionalDTO;
    }
}
