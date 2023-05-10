package com.example.backend.repository;

import com.example.backend.entity.GioHang;
import com.example.backend.entity.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet,String> {
}
