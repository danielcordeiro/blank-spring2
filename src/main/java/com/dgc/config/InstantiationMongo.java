package com.dgc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dgc.domain.nosql.Usuario;
import com.dgc.repositories.UsuarioRepository;

@Configuration
public class InstantiationMongo implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuarioReposiroty;

	@Override
	public void run(String... arg0) throws Exception {

		usuarioReposiroty.deleteAll();

		Usuario maria = new Usuario(null, "Maria Brown", "maria@gmail.com");
		Usuario alex = new Usuario(null, "Alex Green", "alex@gmail.com");
		Usuario bob = new Usuario(null, "Bob Grey", "bob@gmail.com");

		usuarioReposiroty.saveAll(Arrays.asList(maria, alex, bob));
	}

}
