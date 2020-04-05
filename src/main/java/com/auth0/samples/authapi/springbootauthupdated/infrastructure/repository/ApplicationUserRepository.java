package com.auth0.samples.authapi.springbootauthupdated.infrastructure.repository;

import com.auth0.samples.authapi.springbootauthupdated.domain.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
