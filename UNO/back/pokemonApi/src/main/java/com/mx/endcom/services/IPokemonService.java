package com.mx.endcom.services;

import java.util.List;

import com.mx.endcom.entities.Pokemon;

public interface IPokemonService {
	
	public void guardarPokemon(Pokemon pokemon);
	public Pokemon buscarPorApodo(String apodo);
	public List<Pokemon> buscarPorEspecie(String especie);

}
