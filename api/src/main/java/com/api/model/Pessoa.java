package com.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "PESSOA")
public abstract class Pessoa {
	
	@Column(name = "ID_PESSOA", length = 10)
	private Long idPessoa;
	
	@Column(name = "NOME", length = 10, nullable = false)
	private String nome;
	
	@Column(name = "DATA_NASCIMENTO", nullable = false)
	private Date dataNascimento;
	
	@Column(name = "GENERO", length = 10, nullable = true)
	private String genero;
	
	@Column(name = "ID_ENDERECO", length = 10, nullable = false)
	private Long idEndereco;
	
	
	
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	
	

}
