package com.emmycode.tasks.domain.dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count, // To know the about of tasks in the tasklist
        Double  progress,
        List<TaskDto> tasks
){
}
