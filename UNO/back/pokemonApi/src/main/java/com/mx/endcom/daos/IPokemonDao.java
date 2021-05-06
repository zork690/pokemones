package com.mx.endcom.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mx.endcom.entities.Pokemon;

@Repository
public interface IPokemonDao extends JpaRepository<Pokemon, Integer> {
	
	@Query("SELECT pokemon FROM Pokemon pokemon WHERE pokemon.apodo=:apodo")
	public Pokemon buscarPorApodo(@Param("apodo") String apodo);
	
	@Query("SELECT pokemon FROM Pokemon pokemon WHERE pokemon.especie=:especie")
	public List<Pokemon> buscarPorEspecie(@Param("especie") String especie);

}
