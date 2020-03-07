package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica extends Pessoa{
	
	@Column(name = "ID_FISICA")
	private Long idPessoaFisica;
	
	@Column(name = "CPF", nullable = false)
	private Long CPF;

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
		CPF = cPF;
	}

	public Long getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(Long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}
	
	
	
}
