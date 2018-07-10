package br.com.frz.construtor;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.frz.construtor.dados.Elemento;
import br.com.frz.construtor.dao.ElementoDao;

@SpringBootApplication
public class ConstrutorApplication implements CommandLineRunner {

	public static void main(String... args) {
		SpringApplication.run(ConstrutorApplication.class, args);
	}

	@Autowired
	private ElementoDao elementoDao;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Collection<Elemento> result = elementoDao.findAll();
		for (Elemento e: result) {
			e.getAtributoCollection().forEach(a -> System.out.println(a.getOrdem()));
		}
	}

}
