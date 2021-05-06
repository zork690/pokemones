package com.mx.endcom.services;

import java.util.List;

import com.mx.endcom.entities.Pokemon;

public interface IPokemonService {
	
	/**
	 * Se usa para guardar Pokemones en la base
	 * Genera de manera aleatoria los valores de ataque, salud, defensa
	 * @param pokemon
	 */
	public void guardarPokemon(Pokemon pokemon);
	public Pokemon buscarPorApodo(String apodo);
	public List<Pokemon> buscarPorEspecie(String especie);

}
