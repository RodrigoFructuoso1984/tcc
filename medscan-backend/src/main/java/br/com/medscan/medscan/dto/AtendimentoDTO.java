package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Atendimento;

import java.io.Serializable;

public class AtendimentoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idAtendimento;
    private String nomeAtendimento;

    public AtendimentoDTO() {
    }

    public AtendimentoDTO(Integer idAtendimento, String nomeAtendimento) {
        this.idAtendimento = idAtendimento;
        this.nomeAtendimento = nomeAtendimento;
    }

    public AtendimentoDTO(Atendimento entity) {
        idAtendimento = entity.getIdAtendimento();
        nomeAtendimento = entity.getNomeAtendimento();
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
}
