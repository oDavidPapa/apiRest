package com.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario extends Pessoa {
	
	@Column(name = "ID_FUNCIONARIO", length = 10)
	private Long idFuncionario;
	
	@Column(name = "ID_PESSOA", length = 10, nullable = false)
	private Long idPessoa;
	
	@Column(name = "ID_EMPRESA", length = 10, nullable = false)
	private Long idEmpresa;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Column(name = "STATUS")
	private Long status;
	
	@Column(name = "DATA_ADMISSAO")
	private Date dataAdmissao;
	
	@Column(name = "DATA_DEMISSAO")
	private Date dataDemissao;
	
	@Column(name = "FOTO_PERFIL")
	private String fotoPerfil;
	
	
	public Long getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}
	
	
}
