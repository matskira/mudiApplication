package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Responsável por execurar nossa aplicação com o servidor integrado TomCat
@SpringBootApplication
public class MudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}

}
