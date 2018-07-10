package br.com.frz.construtor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.frz.construtor.dados.Atributo;

@Repository
public interface AtributoDao extends JpaRepository<Atributo, Integer> {	
}