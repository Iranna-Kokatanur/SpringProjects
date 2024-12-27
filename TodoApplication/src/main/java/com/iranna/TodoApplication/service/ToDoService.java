package com.iranna.TodoApplication.service;

import com.iranna.TodoApplication.models.Task;
import com.iranna.TodoApplication.repos.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final TaskRepository taskRepository;

    public ToDoService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {

        return taskRepository.findAll();

    }

    public void addTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task getTask(Long id) {
        return taskRepository.findById(id).orElseThrow( () -> new RuntimeException("Task not found"));
    }

    public void toggleTask(Long id) {
        Task task = getTask(id);
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
