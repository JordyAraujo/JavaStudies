package repositorio;

import org.springframework.data.repository.CrudRepository;

import jpa.Todo;

public interface TodoRepositorio extends CrudRepository<Todo, Long> {

}
