import React from 'react';
import axios from "axios";
import logo from "../assets/logo_MedScan.png";

const styles = {
  float: 'left',
  textAlign: 'center',
  margin: 10,
  padding: 20
}

const api = axios.create({
  baseURL: "http://localhost:8080",
});

export class MedscanContainer extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      especialidades: [],
      convenios: [],
      atendimentos: [],
      profissionais: [],
      profissionaisFiltered: [],
      especialidadeSelecionado: 0,
      convenioSelecionado: 0,
      atendimentoSelecionado: 0,
      nomeProfissional: ""
    };
  }

  componentDidMount() {
    this.fetchEspecialidades();
    this.fetchProfissionais();
    this.fetchAtendimentos();
    this.fetchConvenios();
  }

  fetchEspecialidades = () => {
    /*
    api.get(`/especialidades`)
      .then((response) => {
        this.setState({
          especialidades: response
        });
      })
      .catch((error) => {
        console.log(error);
      });
    */

    this.setState({
      especialidades: [{"id":1,"nome":"Cardiologista"},{"id":2,"nome":"Urologista"},{"id":3,"nome":"Ortopedista"}]
    });
  };

  fetchProfissionais = () => {
    this.setState({
      profissionais: [{"id":1,"nome":"Yuri da Silva Brasil","numeroConselho":155274,"especialidade":{"id":1,"nome":"Cardiologista"},"enderecos":[{"numeroEndereco":"778","complementoEndereco":null,"telefoneEndereco":"(16)3114-1038","logradouroDTO":{"id":1,"nome":"Rua Napoleão Selmi Dei","bairro":"Vila Harmonia","cep":"14802-500","cidade":{"id":1,"nome":"Araraquara","estado":{"id":1,"nome":"São Paulo","sigla":"SP"}}},"id":1}],"convenios":[{"idConvenio":2,"nomeConvenio":"Sulamerica"}],"atendimentos":[{"idAtendimento":1,"nomeAtendimento":"Presencial"}]},
      {"id":2,"nome":"Helder Polido","numeroConselho":15524,"especialidade":{"id":2,"nome":"Urologista"},"enderecos":[{"numeroEndereco":"348","complementoEndereco":null,"telefoneEndereco":"(16)3374-1585","logradouroDTO":{"id":2,"nome":"Rua Dr. Carlos Botelho","bairro":"Centro","cep":"13561-003","cidade":{"id":2,"nome":"São Carlos","estado":{"id":1,"nome":"São Paulo","sigla":"SP"}}},"id":2}],"convenios":[{"idConvenio":1,"nomeConvenio":"Unimed"}],"atendimentos":[{"idAtendimento":2,"nomeAtendimento":"TeleAtendimento"}]},
      {"id":3,"nome":"Marcelo Castiga","numeroConselho":50879,"especialidade":{"id":3,"nome":"Ortopedista"},"enderecos":[{"numeroEndereco":"2121","complementoEndereco":"Sala 1503-Edifício Times Square","telefoneEndereco":"(16)3624-9076","logradouroDTO":{"id":3,"nome":"Avenida Presidente Vargas","bairro":"Alto da Boa Vista","cep":"14025-700","cidade":{"id":3,"nome":"Ribeirão Preto","estado":{"id":1,"nome":"São Paulo","sigla":"SP"}}},"id":3}],"convenios":[{"idConvenio":1,"nomeConvenio":"Unimed"},{"idConvenio":2,"nomeConvenio":"SulaAmerica"}],"atendimentos":[{"idAtendimento":2,"nomeAtendimento":"TeleAtendimento"},{"idAtendimento":1,"nomeAtendimento":"Presencial"}]}]
    });
  };

  fetchAtendimentos = () => {
    this.setState({
      atendimentos: [{"idAtendimento":1,"nomeAtendimento":"Presencial"},{"idAtendimento":2,"nomeAtendimento":"Tele Atendimento"}]
    });
  };

  fetchConvenios = () => {
    this.setState({
      convenios: [{"idConvenio":1,"nomeConvenio":"Unimed"},{"idConvenio":2,"nomeConvenio":"Sulamerica"},{"idConvenio":3,"nomeConvenio":"Sus"}]
    });
  };

  onChangeEspecialidade = (e) => {
    this.setState({
      especialidadeSelecionado: Number(e.target.value)
    })
  };

  onChangeConvenio = (e) => {
    this.setState({
      convenioSelecionado: Number(e.target.value)
    })
  };

  onChangeAtendimento = (e) => {
    this.setState({
      atendimentoSelecionado: Number(e.target.value)
    })
  };

  onChangeNomeProfissional = (e) => {
    this.setState({
      nomeProfissional: e.target.value
    })
  };

  renderProfissionaisSelecionados = () => {
      return this.state.profissionaisFiltered.map((p) => (
        <div>{p.nome}</div>
      ));
  }

  buscarProfissional = () => {
    const profissionaisFiltered = this.state.profissionais.filter((p) => {
      return p.nome.toUpperCase().includes(this.state.nomeProfissional.toUpperCase())
        && (this.state.especialidadeSelecionado === 0 || p.especialidade.id === this.state.especialidadeSelecionado)
        && (this.state.convenioSelecionado === 0 || p.convenios.filter(c => c.idConvenio === this.state.convenioSelecionado).length > 0)
        && (this.state.atendimentoSelecionado === 0 || p.atendimentos.filter(c => c.idAtendimento === this.state.atendimentoSelecionado).length > 0);
    });

    this.setState({
      profissionaisFiltered
    })
  };

  render() {
    return (
      <div className="container">
        <div className="row" style={{width:'800px'}}>
          <div className="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div className="card border-0 shadow rounded-3 my-5 bg-success" style={{width:'600px'}}>
              
              <img src={logo} className="rounded mx-auto d-block img-fluid" alt={"logo"}/>
              
              <div className="card-body p-4 p-sm-5">
                
                <form className="form-inline">

                  <div className="row mb-3" style={{width:'550px'}}>
                    <div className="col-4"> 
                      <label className="form-label">Especialidade:</label>
                      <select id={this.state.especialidadeSelecionado} className="form-control" onChange={this.onChangeEspecialidade}
                        value={this.state.especialidadeSelecionado} >
                        <option value={0}>Selecione</option> {
                          this.state.especialidades.map(
                            row => <option value={row.id} key={row.id}>{row.nome}</option>
                          )
                        }
                      </select>
                    </div>

                    <div className="col-4">
                      <label className="form-label">Convênio:</label>
                      <select id={this.state.convenioSelecionado} className="form-control" onChange={this.onChangeConvenio}
                        value={this.state.convenioSelecionado} >
                        <option value={0}>Selecione</option> {
                          this.state.convenios.map(
                            row => <option value={row.idConvenio} key={row.idConvenio}>{row.nomeConvenio}</option>
                          )
                        }
                      </select>
                    </div>

                    <div className="col-4">
                      <label className="form-label">Atendimento:</label>
                      <select id={this.state.atendimentoSelecionado} className="form-control" onChange={this.onChangeAtendimento}
                        value={this.state.atendimentoSelecionado} >
                        <option value={0}>Selecione</option> {
                          this.state.atendimentos.map(
                            row => <option value={row.idAtendimento} key={row.idAtendimento}>{row.nomeAtendimento}</option>
                          )
                        }
                      </select>
                    </div>
                    
                  </div>

                  <div className="form-group mb-3" style={{width:'550px'}}>
                      <div className="input-group mb-3" style={{width:'550px'}}>
                        <label>
                          <input style={{width:'464px'}} type="text" placeholder='Buscar por nome' value={this.state.nomeProfissional} onChange={this.onChangeNomeProfissional} /> 
                        </label>
                        <button className="btn-outline-dark bg-white" type="button" onClick={this.buscarProfissional}>Buscar</button>
                      </div>
                  </div>

    
                </form>

                <div className="card" style={{width: '525px'}}>
                  <div className="card-body">
                    {this.renderProfissionaisSelecionados()}
                  </div>
                </div>

              </div>
            </div>
          </div>          
        </div>
      </div>
      

    );
  }

}