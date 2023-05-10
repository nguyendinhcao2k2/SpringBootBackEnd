package com.example.backend.repository;

import com.example.backend.entity.ChiTietSanPham;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham,String> {
}
