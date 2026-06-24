package com.emmycode.tasks.mappers;

import com.emmycode.tasks.domain.dto.TaskDto;
import com.emmycode.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
