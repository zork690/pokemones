package com.mx.endcom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.endcom.daos.IPokemonDao;
import com.mx.endcom.entities.Pokemon;

@Service
public class PokemonServiceImpl implements IPokemonService{
	
	@Autowired
	IPokemonDao pokemonDao;

	@Override
	public void guardarPokemon(Pokemon pokemon) {
		this.pokemonDao.save(pokemon);
		
	}

	@Override
	public Pokemon buscarPorApodo(String apodo) {
		return this.pokemonDao.buscarPorApodo(apodo);
	}

	@Override
	public List<Pokemon> buscarPorEspecie(String especie) {
		return this.pokemonDao.buscarPorEspecie(especie);
	}

}
