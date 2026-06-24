package com.emmycode.tasks.mappers;

import com.emmycode.tasks.domain.dto.TaskListDto;
import com.emmycode.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto); // Converting a dto for an entity

    TaskListDto toDto(TaskList taskList); // converting an entity to a dto
}
