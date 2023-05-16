package com.example.backend.repository;

import com.example.backend.entity.ChiTietSanPham;
import com.example.backend.model.response.ChiTietSanPhamResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author caodinh
 */
public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham,String> {


    @Query("SELECT new com.example.backend.model.response.ChiTietSanPhamResponse(ctsp.id,ctsp.tenSP,ctsp.Img,ctsp.category.ten,ctsp.moTa,ctsp.nhaSanXuat.ten,ctsp.giaBan) FROM ChiTietSanPham ctsp")
    List<ChiTietSanPhamResponse> findAllChiTietSanPham();
    @Query("SELECT new com.example.backend.model.response.ChiTietSanPhamResponse(ctsp.id,ctsp.tenSP,ctsp.Img,ctsp.category.ten,ctsp.moTa,ctsp.nhaSanXuat.ten,ctsp.giaBan) FROM ChiTietSanPham ctsp WHERE ctsp.tenSP LIKE %:name%")
    List<ChiTietSanPhamResponse> findAllByTenSP(@Param("name") String name);

    @Query("SELECT new com.example.backend.model.response.ChiTietSanPhamResponse(ctsp.id,ctsp.tenSP,ctsp.Img,ctsp.category.ten,ctsp.moTa,ctsp.nhaSanXuat.ten,ctsp.giaBan) FROM ChiTietSanPham ctsp WHERE ctsp.category.id = :cateId")
    List<ChiTietSanPhamResponse> findAllByCategoryId(@Param("cateId") String id);
    @Query("SELECT new com.example.backend.model.response.ChiTietSanPhamResponse(ctsp.id,ctsp.tenSP,ctsp.Img,ctsp.category.ten,ctsp.moTa,ctsp.nhaSanXuat.ten,ctsp.giaBan) FROM ChiTietSanPham ctsp WHERE ctsp.id = :id")
    ChiTietSanPhamResponse getOneByID(@Param("id") String id);
}
