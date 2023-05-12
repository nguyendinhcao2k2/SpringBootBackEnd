package com.example.backend.repository;

import com.example.backend.entity.Category;
import com.example.backend.model.response.CategoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author caodinh
 */
public interface CategoryRepository extends JpaRepository<Category,String> {

    @Query("SELECT new com.example.backend.model.response.CategoryResponse(ct.id, ct.ten) FROM Category ct")
    List<CategoryResponse> findAllCategoryDTO();
}
