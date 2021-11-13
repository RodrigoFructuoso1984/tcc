package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "convenio")
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idConvenio;
    String nomeConvenio;

    @ManyToMany(mappedBy = "convenios")
    private List<Profissional> profissionals = new ArrayList<>();

    public Convenio(){
    }

    public Convenio(Integer idConvenio, String nomeConvenio) {
        this.idConvenio = idConvenio;
        this.nomeConvenio = nomeConvenio;
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

    public List<Profissional> getProfissionals() {
        return profissionals;
    }

    public void setProfissionals(List<Profissional> profissionals) {
        this.profissionals = profissionals;
    }
}
