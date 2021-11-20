package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAtendimento;
    String nomeAtendimento;

    @ManyToMany(mappedBy = "atendimentos")
    private List<Profissional> profissionals = new ArrayList<>();

    public Atendimento() {
    }

    public Atendimento(Integer idAtendimento, String nomeAtendimento) {
        this.idAtendimento = idAtendimento;
        this.nomeAtendimento = nomeAtendimento;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getNomeAtendimento() {
        return nomeAtendimento;
    }

    public void setNomeAtendimento(String nomeAtendimento) {
        this.nomeAtendimento = nomeAtendimento;
    }

    public List<Profissional> getProfissionals() {
        return profissionals;
    }

    public void setProfissionals(List<Profissional> profissionals) {
        this.profissionals = profissionals;
    }
}
