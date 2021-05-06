package com.mx.endcom.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMONES")
public class Pokemon implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "APODO")
	private String apodo;

	@Column(name = "ESPECIE")
	private String especie;

	@Column(name = "ATAQUE")
	private int ataque;
	
	@Column(name = "DEFENSA")
	private int defensa;
	
	@Column(name = "SALUD")
	private int salud;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", apodo=" + apodo + ", especie=" + especie + ", ataque=" + ataque + ", defensa="
				+ defensa + ", salud=" + salud + "]";
	}
	
	

}
