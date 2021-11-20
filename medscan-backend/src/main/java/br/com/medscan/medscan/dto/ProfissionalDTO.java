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

    public ProfissionalDTO() {
    }

    public ProfissionalDTO(Integer id, String nome, Integer numeroConselho, EspecialidadeDTO especialidade, List<EnderecoDTO> enderecos, List<ConvenioDTO> convenios) {
        this.id = id;
        this.nome = nome;
        this.numeroConselho = numeroConselho;
        this.especialidade = especialidade;
        this.enderecos = enderecos;
        this.convenios = convenios;
    }

    public ProfissionalDTO(Profissional entity) {
        id = entity.getId();
        nome = entity.getNome();
        numeroConselho = entity.getNumeroConselho();
        especialidade = new EspecialidadeDTO(entity.getEspecialidade());
        enderecos = entity.getEnderecos().stream().map(EnderecoDTO::new).collect(Collectors.toList());
        convenios = entity.getConvenios().stream().map(ConvenioDTO::new).collect(Collectors.toList());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfissionalDTO that = (ProfissionalDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(numeroConselho, that.numeroConselho) && Objects.equals(especialidade, that.especialidade) && Objects.equals(enderecos, that.enderecos) && Objects.equals(convenios, that.convenios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, numeroConselho, especialidade, enderecos, convenios);
    }

    @Override
    public String toString() {
        return "ProfissionalDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroConselho=" + numeroConselho +
                ", especialidade=" + especialidade +
                ", enderecos=" + enderecos +
                ", convenios=" + convenios +
                '}';
    }
}
