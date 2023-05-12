package com.lmoura.myApp;

import com.lmoura.myApp.domain.Usuario;
import com.lmoura.myApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyAppApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Lorrayne Moura", "lmoura", "123456");
		Usuario u2 = new Usuario(null, "Albert Einstein", "aeinstein", "456789");

		usuarioRepository.saveAll(Arrays.asList(u1,u2));

	}
}
