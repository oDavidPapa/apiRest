package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class Estado {
	
	@Column(name = "ID_ESTADO", length = 10)
	private Long idEstado;
	
	@Column(name = "ID_PAIS", length = 10, nullable = false)
	private Long idPais;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "SIGLA", nullable = false)
	private String sigla;
	
	
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
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
