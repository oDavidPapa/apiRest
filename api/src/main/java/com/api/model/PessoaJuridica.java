package com.api.model;

public class PessoaJuridica extends Pessoa {
	
	private Long idPessoaJuridica;
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
