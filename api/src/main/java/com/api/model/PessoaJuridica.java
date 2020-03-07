package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaJuridica extends Pessoa {
	@Column(name = "ID_JURIDICA")
	private Long idPessoaJuridica;
	
	@Column(name = "CNPJ", nullable = false)
	private Long CNPJ;
	
	
	public Long getIdPessoaJuridica() {
		return idPessoaJuridica;
	}
	public void setIdPessoaJuridica(Long idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}
	public Long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}
	

}
