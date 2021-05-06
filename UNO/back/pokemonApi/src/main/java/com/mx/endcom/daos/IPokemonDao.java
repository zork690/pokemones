package com.mx.endcom.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.endcom.entities.Pokemon;

@Repository
public interface IPokemonDao extends JpaRepository<Pokemon, Integer> {
	
	/**
	 * Para la busqueda de Pokemon por apodo
	 * Regresa null o el Pokemon encontrado
	 * @param apodo
	 * @return
	 */
	@Query("SELECT pokemon FROM Pokemon pokemon WHERE pokemon.apodo=:apodo")
	public Pokemon buscarPorApodo(@Param("apodo") String apodo);
	
	
	/**
	 * Para la busqueda de Pokemones por especie
	 * Regresa una lista de los Pokemones encontrados o un arreglo vacio
	 * @param especie
	 * @return
	 */
	@Query("SELECT pokemon FROM Pokemon pokemon WHERE pokemon.especie=:especie")
	public List<Pokemon> buscarPorEspecie(@Param("especie") String especie);

}
