package com.example.TaskEm.services;

import com.example.TaskEm.models.Task;
import com.example.TaskEm.repositories.TaskRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTask(String taskId) {
        return taskRepository.findById(taskId).get();
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
