package br.com.frz.construtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.frz.construtor.dao.ElementoDao;

@SpringBootApplication
public class ConstrutorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConstrutorApplication.class, args);
	}

	@Autowired
	private ElementoDao elementoDao;

	@Override
	public void run(String... args) throws Exception {
		elementoDao.findAll().forEach(System.out::println);
	}

}
