package com.example.backend.repository;

import com.example.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface UserRepository extends JpaRepository<User,String> {
}
