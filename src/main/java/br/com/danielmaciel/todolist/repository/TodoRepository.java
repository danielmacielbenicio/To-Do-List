package br.com.danielmaciel.todolist.repository;

import br.com.danielmaciel.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public class TodoRepository extends JpaRepository<Todo, Long> {

}
