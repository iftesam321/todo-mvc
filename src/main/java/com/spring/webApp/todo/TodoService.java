package com.spring.webApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList<Todo>();
	private static int todosCount=0;
	static {
		todos.add(new Todo(++todosCount,"admin","Learn Java",LocalDate.now().plusYears(1),false));

		todos.add(new Todo(++todosCount,"Iftesam","Learn C#",LocalDate.now().plusYears(2),false));

		todos.add(new Todo(+todosCount,"Iftesam","Learn Python",LocalDate.now().plusYears(3),false));
	}
	
	public void deleteById(int id)
	{

	Predicate<Todo> condition = todo->todo.getId()==id;
	
	todos.removeIf(condition);
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<Todo> condition = todo->todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(condition).toList();
	}
	
	public void addTodo(String username,String description,LocalDate targetDate,boolean done) {
		todos.add(new Todo(++todosCount,username,description,targetDate,done));
	}

	public static Todo finById(int id) {
		// TODO Auto-generated method stub
		Todo todo = todos.stream()
				  .filter(t->t.getId()==id)
				  .findFirst()
				  .get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		
		todos.add(todo);
		
	}
}
