package com.example.backend.service;

import com.example.backend.model.response.ChiTietSanPhamResponse;

import java.util.List;

/**
 * @author caodinh
 */
public interface ChiTietSanPhamService {

    List<ChiTietSanPhamResponse> getAll();
}