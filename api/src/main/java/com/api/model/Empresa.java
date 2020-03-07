package com.api.model;

public class Empresa {
	
	private Long idEmpresa;
	private Long idEndereco;
	private String razaoSocial;
	private Long CNPJ;
	private String logoMarca;
	
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public Long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getLogoMarca() {
		return logoMarca;
	}
	public void setLogoMarca(String logoMarca) {
		this.logoMarca = logoMarca;
	}
	
	

}
