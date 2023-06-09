package com.example.backend.repository;

import com.example.backend.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author caodinh
 */
public interface ChucVuRepository extends JpaRepository<ChucVu,String>{

    Optional<ChucVu> findById(Long id);
}
