package com.mx.endcom.entities;

public class Ayuda {
	
	private static final String DESARROLLADOR = "CÉSAR ALBERTO SOTO REYES";
	private static final String CORREO = "zork_690@hotmail.com";
	private static final String TELEFONO = "7224304100";
	private static final String LISTAR_POR_GENERACION = "Ingresar SOLO números entre el 1 y el 6";
	private static final String LISTAR_POR_RANGO = "Ingresar SOLO números, el rango uno debe ser menor al rango dos";
	private static final String BUSCAR_POR_APODO = "Para que sea correcta la búsqueda debe ingresar exactamente como lo guardo (entre mayusculas y minusculas) de lo contrario no funcionara la busqueda";
	private static final String BUSCAR_POR_ESPECIE = "Para que sea correcta la búsqueda debe ingresar exactamente como lo guardo (entre mayusculas y minusculas) de lo contrario no funcionara la busqueda";
	
	private String desarrollador;
	private String correo;
	private String telefono;
	private String listarGeneracion;
	private String listarRango;
	private String buscarApodo;
	private String buscarEspecie;
	
	public Ayuda() {
		this.desarrollador = DESARROLLADOR;
		this.correo = CORREO;
		this.telefono = TELEFONO;
		this.listarGeneracion = LISTAR_POR_GENERACION;
		this.listarRango = LISTAR_POR_RANGO;
		this.buscarApodo = BUSCAR_POR_APODO;
		this.buscarEspecie = BUSCAR_POR_ESPECIE;
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

	public String getListarGeneracion() {
		return listarGeneracion;
	}

	public String getListarRango() {
		return listarRango;
	}

	public String getBuscarApodo() {
		return buscarApodo;
	}

	public String getBuscarEspecie() {
		return buscarEspecie;
	}
	
	

}
