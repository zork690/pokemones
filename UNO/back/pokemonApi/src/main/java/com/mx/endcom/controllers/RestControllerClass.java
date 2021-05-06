package com.mx.endcom.controllers;

import java.util.List;

import org.json.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mx.endcom.entities.Ayuda;
import com.mx.endcom.entities.Pokemon;
import com.mx.endcom.services.IPokemonService; 

@RestController
public class RestControllerClass {
	
	@Autowired
	IPokemonService pokemonService;
	
	private static final Logger log = LoggerFactory.getLogger(RestControllerClass.class);

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/help")
	public ResponseEntity<?> ayudar() {
		log.error("DANDO AYUDA");
		
		return ResponseEntity.ok(new Gson().toJson(new Ayuda()));
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody Pokemon pokemon) {
		log.error("GUARDANDO POKEMON: "+pokemon);
		this.pokemonService.guardarPokemon(pokemon);
		return ResponseEntity.ok(this.pokemonService.buscarPorApodo(pokemon.getApodo()));
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/buscarPorApodo")
	public ResponseEntity<?> buscar(@RequestBody Pokemon pokemon) {
		log.error("BUSCANDO POR APODO: "+pokemon.getApodo());
		Pokemon p = this.pokemonService.buscarPorApodo(pokemon.getApodo());
		return ResponseEntity.ok(new Gson().toJson(p));
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/buscarPorEspecie")
	public ResponseEntity<?> buscarEspecie(@RequestBody Pokemon pokemon) {
		log.error("BUSCANDO POR ESPECIE: "+pokemon.getEspecie());
		List<Pokemon> pokemones = this.pokemonService.buscarPorEspecie(pokemon.getEspecie());
		return ResponseEntity.ok(new Gson().toJson(pokemones));
	}
	
	
}
