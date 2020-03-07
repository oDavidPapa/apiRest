package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class Empresa {
	
	@Column(name = "ID_EMPRESA", length = 10)
	private Long idEmpresa;
	
	@Column(name = "ID_ENDERECO", length = 10, nullable = false)
	private Long idEndereco;
	
	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name = "CNPJ")
	private Long CNPJ;
	
	@Column(name = "LOGOMARCA", nullable = true)
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
