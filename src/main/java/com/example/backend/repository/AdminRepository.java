package com.example.backend.repository;

import com.example.backend.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface AdminRepository extends JpaRepository<Admin,String> {
}
