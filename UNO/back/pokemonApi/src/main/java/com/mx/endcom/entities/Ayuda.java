package com.mx.endcom.entities;

public class Ayuda {
	
	private static final String DESARROLLADOR = "CÉSAR ALBERTO SOTO REYES";
	private static final String CORREO = "zork_690@hotmail.com";
	private static final String TELEFONO = "7224304100";
	
	private String desarrollador;
	private String correo;
	private String telefono;
	
	public Ayuda() {
		this.desarrollador = DESARROLLADOR;
		this.correo = CORREO;
		this.telefono = TELEFONO;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public String getCorreo() {
		return correo;
	}

	public String getTelefono() {
		return telefono;
	}
	
	

}
