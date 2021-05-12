package io.carba.taskang.controller;

import io.carba.taskang.domain.Task;
import io.carba.taskang.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks() {
        return taskService.listTasks();
    }

    @PostMapping(value = {"", "/"})
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }

}
