package com.example.backend.repository;

import com.example.backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface CategoryRepository extends JpaRepository<Category,String> {
}
