package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Atendimento;

import java.io.Serializable;
import java.time.LocalDate;

public class AtendimentoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idAtendimento;
    private LocalDate dataAtendimento;
    private Integer notaAtendimento;
    private String comentarioAtendimento;
    private ProfissionalDTO profissionalDTO;

    public AtendimentoDTO() {
    }

    public AtendimentoDTO(Integer idAtendimento, LocalDate dataAtendimento, Integer notaAtendimento, String comentarioAtendimento, ProfissionalDTO profissionalDTO) {
        this.idAtendimento = idAtendimento;
        this.dataAtendimento = dataAtendimento;
        this.notaAtendimento = notaAtendimento;
        this.comentarioAtendimento = comentarioAtendimento;
        this.profissionalDTO = profissionalDTO;
    }

    public AtendimentoDTO(Atendimento entity) {
        idAtendimento = entity.getIdAtendimento();
        dataAtendimento = entity.getDataAtendimento();
        notaAtendimento = entity.getNotaAtendimento();
        comentarioAtendimento = entity.getComentarioAtendimento();
        profissionalDTO = new ProfissionalDTO(entity.getProfissional());
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

    public ProfissionalDTO getProfissionalDTO() {
        return profissionalDTO;
    }

    public void setProfissionalDTO(ProfissionalDTO profissionalDTO) {
        this.profissionalDTO = profissionalDTO;
    }
}
