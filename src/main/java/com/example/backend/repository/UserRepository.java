package com.example.backend.repository;

import com.example.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author caodinh
 */
public interface UserRepository extends JpaRepository<User,String> {

     Optional<User> findByEmail(String email);

}
