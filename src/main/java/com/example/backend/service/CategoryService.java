package com.example.backend.service;

import com.example.backend.model.response.CategoryResponse;

import java.util.List;

/**
 * @author caodinh
 */
public interface CategoryService {

    List<CategoryResponse> findAll();

}
