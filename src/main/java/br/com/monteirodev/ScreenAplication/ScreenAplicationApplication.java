package br.com.monteirodev.ScreenAplication;

import br.com.monteirodev.ScreenAplication.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenAplicationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenAplicationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.showMenu();
	}
}
