package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIDADE")
public class Cidade {
	@Column(name = "ID_CIDADE", length = 10)
	private Long idCidade;
	
	@Column(name = "ID_ESTADO", length = 10, nullable = false)
	private Long idEstado;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "CEP")
	private String CEP;
	
	
	public Long getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	
	

}
