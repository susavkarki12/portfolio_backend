package com.susav.portfolio.repository;

import com.susav.portfolio.Model.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetailsEntity, Long> {
}
