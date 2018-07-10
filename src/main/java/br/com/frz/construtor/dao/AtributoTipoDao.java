package br.com.frz.construtor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frz.construtor.dados.AtributoTipo;

@Repository
public interface AtributoTipoDao extends JpaRepository<AtributoTipo, Integer> {
}