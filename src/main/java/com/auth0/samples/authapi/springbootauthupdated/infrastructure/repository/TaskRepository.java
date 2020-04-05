package com.auth0.samples.authapi.springbootauthupdated.infrastructure.repository;

import com.auth0.samples.authapi.springbootauthupdated.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}