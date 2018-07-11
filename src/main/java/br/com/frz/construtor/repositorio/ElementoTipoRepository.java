package br.com.frz.construtor.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frz.construtor.entidade.ElementoTipo;

@Repository
public interface ElementoTipoRepository extends JpaRepository<ElementoTipo, Integer> {

}