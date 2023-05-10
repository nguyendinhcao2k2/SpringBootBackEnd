package com.example.backend.repository;

import com.example.backend.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface GioHangRepository extends JpaRepository<GioHang,String> {
}
