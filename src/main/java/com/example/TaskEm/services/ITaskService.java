package com.example.TaskEm.services;

import com.example.TaskEm.models.Task;
import java.util.List;

public interface ITaskService {

    List<Task> getTasks();

    Task getTask(final String taskId);

    Task createTask(Task task);
}
