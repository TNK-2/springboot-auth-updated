package com.auth0.samples.authapi.springbootauthupdated.task.Repository;

import com.auth0.samples.authapi.springbootauthupdated.task.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}