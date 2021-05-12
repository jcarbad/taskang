package io.carba.taskang.service;

import io.carba.taskang.domain.Task;

public interface TaskService {

    Iterable<Task> listTasks();

    Task save(Task task);
}
