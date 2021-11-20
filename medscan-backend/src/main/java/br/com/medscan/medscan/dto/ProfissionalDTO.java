package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Convenio;
import br.com.medscan.medscan.model.Profissional;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProfissionalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Integer numeroConselho;

    private EspecialidadeDTO especialidade;
    private List<EnderecoDTO> enderecos;
    private List<ConvenioDTO> convenios;
    private List<AtendimentoDTO> atendimentos;

    public ProfissionalDTO() {
    }

    public ProfissionalDTO(Integer id, String nome, Integer numeroConselho, EspecialidadeDTO especialidade, List<EnderecoDTO> enderecos, List<ConvenioDTO> convenios, List<AtendimentoDTO> atendimentos) {
        this.id = id;
        this.nome = nome;
        this.numeroConselho = numeroConselho;
        this.especialidade = especialidade;
        this.enderecos = enderecos;
        this.convenios = convenios;
        this.atendimentos = atendimentos;
    }

    public ProfissionalDTO(Profissional entity) {
        id = entity.getId();
        nome = entity.getNome();
        numeroConselho = entity.getNumeroConselho();
        especialidade = new EspecialidadeDTO(entity.getEspecialidade());
        enderecos = entity.getEnderecos().stream().map(EnderecoDTO::new).collect(Collectors.toList());
        convenios = entity.getConvenios().stream().map(ConvenioDTO::new).collect(Collectors.toList());
        atendimentos = entity.getAtendimentos().stream().map(AtendimentoDTO::new).collect(Collectors.toList());
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

    public Integer getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(Integer numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    public EspecialidadeDTO getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeDTO especialidade) {
        this.especialidade = especialidade;
    }

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ConvenioDTO> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<ConvenioDTO> convenios) {
        this.convenios = convenios;
    }

    public List<AtendimentoDTO> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(List<AtendimentoDTO> atendimentos) {
        this.atendimentos = atendimentos;
    }
}
