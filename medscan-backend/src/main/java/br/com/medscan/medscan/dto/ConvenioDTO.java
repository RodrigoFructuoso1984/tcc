package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Convenio;

import java.io.Serializable;
import java.util.Objects;

public class ConvenioDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idConvenio;
    private String nomeConvenio;

    public ConvenioDTO() {
    }

    public ConvenioDTO(Integer idConvenio, String nomeConvenio) {
        this.idConvenio = idConvenio;
        this.nomeConvenio = nomeConvenio;
    }

    public ConvenioDTO(Convenio entity) {
        idConvenio = entity.getIdConvenio();
        nomeConvenio = entity.getNomeConvenio();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConvenioDTO that = (ConvenioDTO) o;
        return Objects.equals(idConvenio, that.idConvenio) && Objects.equals(nomeConvenio, that.nomeConvenio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConvenio, nomeConvenio);
    }

    @Override
    public String toString() {
        return "ConvenioDTO{" +
                "idConvenio=" + idConvenio +
                ", nomeConvenio='" + nomeConvenio + '\'' +
                '}';
    }
}
