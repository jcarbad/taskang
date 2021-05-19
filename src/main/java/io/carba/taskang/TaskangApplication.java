package io.carba.taskang;

import io.carba.taskang.domain.Task;
import io.carba.taskang.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class TaskangApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskangApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            List.of(
                    new Task(1L, "Task name #1", LocalDate.now(), true),
                    new Task(2L, "Task name #2", LocalDate.now(), true),
                    new Task(3L, "Task name #3", LocalDate.now().plusDays(10), false),
                    new Task(4L, "Task name #4", LocalDate.now().plusDays(3), false),
                    new Task(5L, "Task name #5", LocalDate.now().plusDays(5), true),
                    new Task(6L, "Task name #6", LocalDate.now().plusDays(1), false)
            ).forEach(taskService::save);
        };
    }
}
