package br.com.medscan.medscan.dto;

import javax.validation.constraints.NotNull;

public class ProfissionalFilter {
    @NotNull
    private Integer especialidadeId;
    @NotNull
    private Integer convenioId;
    @NotNull
    private Integer atendimentoId;
    @NotNull
    private String nomeProfissional;

    public Integer getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(Integer especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    public Integer getConvenioId() {
        return convenioId;
    }

    public void setConvenioId(Integer convenioId) {
        this.convenioId = convenioId;
    }

    public Integer getAtendimentoId() {
        return atendimentoId;
    }

    public void setAtendimentoId(Integer atendimentoId) {
        this.atendimentoId = atendimentoId;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }
}
