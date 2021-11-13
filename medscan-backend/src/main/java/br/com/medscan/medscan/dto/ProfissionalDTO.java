package br.com.medscan.medscan.dto;

import br.com.medscan.medscan.model.Atendimento;
import br.com.medscan.medscan.model.Convenio;
import br.com.medscan.medscan.model.Endereco;
import br.com.medscan.medscan.model.Profissional;

import java.io.Serializable;

public class ProfissionalDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Integer numeroConselho;

    private EspecialidadeDTO especialidade;
    private EnderecoDTO enderecoDTO;
    private ConvenioDTO convenioDTO;

    public ProfissionalDTO(){
    }

    public ProfissionalDTO(Integer id, String nome, Integer numeroConselho, EspecialidadeDTO especialidade, EnderecoDTO enderecoDTO, ConvenioDTO convenioDTO) {
        this.id = id;
        this.nome = nome;
        this.numeroConselho = numeroConselho;
        this.especialidade = especialidade;
        this.enderecoDTO = enderecoDTO;
        this.convenioDTO = convenioDTO;
    }

    public ProfissionalDTO(Profissional entity){
        id = entity.getId();
        nome = entity.getNome();
        numeroConselho = entity.getNumeroConselho();
        especialidade = new EspecialidadeDTO(entity.getEspecialidade());
        enderecoDTO = new EnderecoDTO((Endereco) entity.getEnderecos());
        convenioDTO = new ConvenioDTO((Convenio) entity.getConvenios());
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

    public EspecialidadeDTO getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeDTO especialidade){
        this.especialidade = especialidade;
    }

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public ConvenioDTO getConvenioDTO() {
        return convenioDTO;
    }

    public void setConvenioDTO(ConvenioDTO convenioDTO) {
        this.convenioDTO = convenioDTO;
    }

}
