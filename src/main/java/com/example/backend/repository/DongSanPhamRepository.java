package com.example.backend.repository;

import com.example.backend.entity.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author caodinh
 */
public interface DongSanPhamRepository extends JpaRepository<DongSanPham,String> {
}
