package jpa;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import repositorio.TodoRepositorio;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,  args);
	}

	@Bean
	public CommandLineRunner jpaSample(TodoRepositorio todoRepo) {
		return (args) -> {
			
			todoRepo.save(new Todo("Teste"));
			
			Todo todo = new Todo("Teste Detalhado");
			todo.setDataFim(new Date());
			todo.setDescricao("Descrição Detalhada");
			todoRepo.save(todo);
			
			todoRepo.findAll().forEach(System.out::println);
		};
	}
}
