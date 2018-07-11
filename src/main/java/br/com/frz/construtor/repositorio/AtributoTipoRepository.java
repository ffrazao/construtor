package br.com.frz.construtor.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frz.construtor.entidade.AtributoTipo;

@Repository
public interface AtributoTipoRepository extends JpaRepository<AtributoTipo, Integer> {
	
}