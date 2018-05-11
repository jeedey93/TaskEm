package com.example.TaskEm.controllers;

import com.example.TaskEm.models.Task;
import com.example.TaskEm.services.ITaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TaskController {

    private static final String MAPPING = "/tasks";
    private final ITaskService taskService;

    public TaskController(ITaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Task getTaskById(@PathVariable("id") String id) {
        //LOGGER.info("PricingController.get({})", priceObjectId);
        return taskService.getTask(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = {MAPPING})
    @ResponseStatus(HttpStatus.CREATED)
    public Task add(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}
