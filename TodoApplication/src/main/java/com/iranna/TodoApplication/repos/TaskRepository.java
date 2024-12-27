package com.iranna.TodoApplication.repos;

import com.iranna.TodoApplication.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
