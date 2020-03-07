package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais {
	
	@Column(name = "ID_PAIS", length = 10)
	private Long idPais;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SILGLA")
	private String sigla;
	
	
	public Long getIdPais() {
		return idPais;
	}
	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

}
