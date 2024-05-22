package com.taskloom.domain;

import com.taskloom.domain.enums.TodoPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class TodoDto {

    @NotNull
    @NotBlank
    private String taskName;
    private String description;
    private LocalDate dueDate;
    private TodoPriority priority;
}
