package br.com.danielmaciel.todolist.service;

import br.com.danielmaciel.todolist.entity.Todo;
import br.com.danielmaciel.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
    }
    public List<Todo> list() {
        Sort.by("prioridade").ascending().and(Sort.by("nome").ascending());
    }
    public List<Todo> update(Todo todo) {
    return list();
    }
    public List<Todo> delete(Long id) {
    todoRepository.deleteById(id);
    return list();
    }
}
