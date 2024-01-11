package com.accolite.codelyzer.repository;

import com.accolite.codelyzer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByEmail(String email);
}
