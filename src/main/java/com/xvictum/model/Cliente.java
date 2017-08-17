package com.xvictum.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "nome_empresa", nullable = false)
	private String nome_empresa;

	@Column(name = "endereco", nullable = false)
	private String endereco;

	@Column(name = "nome_contato", nullable = false)
	private String nome_contato;

	@Column(name = "cnpj", nullable = false)
	private int cnpj;

	@Column(name = "insc_estadual")
	private String insc_estadual;

	@Column(name = "municipio")
	private String municipio;

	@Column(name = "uf")
	private String uf;

	@Column(name = "bairro_distrito")
	private String bairro_distrito;

	@Column(name = "tipo_cliente")
	private String tipo_cliente;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getNome_empresa() {
		return nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getInsc_estadual() {
		return insc_estadual;
	}

	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBairro_distrito() {
		return bairro_distrito;
	}

	public void setBairro_distrito(String bairro_distrito) {
		this.bairro_distrito = bairro_distrito;
	}

	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (nome_empresa != null && !nome_empresa.trim().isEmpty())
			result += "nome_empresa: " + nome_empresa;
		if (endereco != null && !endereco.trim().isEmpty())
			result += ", endereco: " + endereco;
		if (nome_contato != null && !nome_contato.trim().isEmpty())
			result += ", nome_contato: " + nome_contato;
		result += ", cnpj: " + cnpj;
		if (insc_estadual != null && !insc_estadual.trim().isEmpty())
			result += ", insc_estadual: " + insc_estadual;
		if (municipio != null && !municipio.trim().isEmpty())
			result += ", municipio: " + municipio;
		if (uf != null && !uf.trim().isEmpty())
			result += ", uf: " + uf;
		if (bairro_distrito != null && !bairro_distrito.trim().isEmpty())
			result += ", bairro_distrito: " + bairro_distrito;
		if (tipo_cliente != null && !tipo_cliente.trim().isEmpty())
			result += ", tipo_cliente: " + tipo_cliente;
		return result;
	}
}