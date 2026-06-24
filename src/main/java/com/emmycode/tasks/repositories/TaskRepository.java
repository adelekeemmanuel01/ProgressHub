package com.emmycode.tasks.repositories;

import com.emmycode.tasks.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskListId(UUID taskListId);
    Optional<Task> findByTaskListIdAndId(UUID taskListId, UUID Id);
    void deleteByTaskListIdAndId(UUID taskListId, UUID Id);
}
