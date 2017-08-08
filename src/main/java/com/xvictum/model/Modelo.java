package com.xvictum.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import com.xvictum.model.Marca;
import javax.persistence.ManyToOne;

@Entity
public class Modelo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@ManyToOne
	private Marca marca;

	@Column(nullable = false)
	private String decricao_modelo;

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
		if (!(obj instanceof Modelo)) {
			return false;
		}
		Modelo other = (Modelo) obj;
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

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(final Marca marca) {
		this.marca = marca;
	}

	public String getDecricao_modelo() {
		return decricao_modelo;
	}

	public void setDecricao_modelo(String decricao_modelo) {
		this.decricao_modelo = decricao_modelo;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (decricao_modelo != null && !decricao_modelo.trim().isEmpty())
			result += "decricao_modelo: " + decricao_modelo;
		return result;
	}
}