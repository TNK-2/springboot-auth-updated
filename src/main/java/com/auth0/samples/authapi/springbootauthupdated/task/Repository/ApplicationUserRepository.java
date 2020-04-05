package com.auth0.samples.authapi.springbootauthupdated.task.Repository;

import com.auth0.samples.authapi.springbootauthupdated.task.Entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
