package com.example.backend.service;

import com.example.backend.model.response.ChiTietSanPhamResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author caodinh
 */
public interface ChiTietSanPhamService {

    List<ChiTietSanPhamResponse> getAll() throws IOException;

    ChiTietSanPhamResponse getOneById(String id);

    List<ChiTietSanPhamResponse> getAllByName(String name);

    List<ChiTietSanPhamResponse> findAllByCateID(String id);

}
