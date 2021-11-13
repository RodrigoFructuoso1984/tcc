package br.com.medscan.medscan.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profissional")
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer numeroConselho;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;

    @ManyToMany
    @JoinTable(name = "profissional_endereco",
            joinColumns = @JoinColumn(name = "profissional_id"),
            inverseJoinColumns = @JoinColumn(name = "endereco_id"))
    private List<Endereco> enderecos = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "profissional_convenio",
            joinColumns = @JoinColumn(name = "profissional_id"),
            inverseJoinColumns = @JoinColumn(name = "convenio_id"))
    private List<Convenio> convenios = new ArrayList<>();

    @OneToMany(mappedBy = "profissional")
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Profissional(){
    }

    public Profissional(Integer id, String nome, Integer numeroConselho, Especialidade especialidade, List<Endereco> enderecos, List<Convenio> convenios, List<Atendimento> atendimentos) {
        this.id = id;
        this.nome = nome;
        this.numeroConselho = numeroConselho;
        this.especialidade = especialidade;
        this.enderecos = enderecos;
        this.convenios = convenios;
        this.atendimentos = atendimentos;
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

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Convenio> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<Convenio> convenios) {
        this.convenios = convenios;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}
