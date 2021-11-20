package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAtendimento;
    LocalDate dataAtendimento;
    Integer notaAtendimento;
    String comentarioAtendimento;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;

    public Atendimento() {
    }

    public Atendimento(Integer idAtendimento, LocalDate dataAtendimento, Integer notaAtendimento, String comentarioAtendimento) {
        this.idAtendimento = idAtendimento;
        this.dataAtendimento = dataAtendimento;
        this.notaAtendimento = notaAtendimento;
        this.comentarioAtendimento = comentarioAtendimento;
    }

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Integer getNotaAtendimento() {
        return notaAtendimento;
    }

    public void setNotaAtendimento(Integer notaAtendimento) {
        this.notaAtendimento = notaAtendimento;
    }

    public String getComentarioAtendimento() {
        return comentarioAtendimento;
    }

    public void setComentarioAtendimento(String comentarioAtendimento) {
        this.comentarioAtendimento = comentarioAtendimento;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
}
