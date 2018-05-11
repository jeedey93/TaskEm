package com.example.TaskEm.repositories;

import com.example.TaskEm.models.Task;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findAll();

    List<Task> findByTitle(String title);
}
