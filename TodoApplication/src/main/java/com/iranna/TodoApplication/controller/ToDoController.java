package com.iranna.TodoApplication.controller;

import com.iranna.TodoApplication.models.Task;
import com.iranna.TodoApplication.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(@Autowired ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = toDoService.getTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        toDoService.addTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        toDoService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id){
        toDoService.toggleTask(id);
        return "redirect:/";
    }

}
