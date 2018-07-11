package br.com.frz.construtor.servico;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frz.construtor.entidade.Elemento;
import br.com.frz.construtor.repositorio.ElementoRepository;

@Service
public class ElementoService {

	@Autowired
	private ElementoRepository repositorio;

	@Transactional
	public void exibeDados() {
		for (Elemento e : repositorio.findAll()) {
			e.getAtributoCollection().forEach(a -> System.out.println(a.getOrdem()));
		}
	}
}
