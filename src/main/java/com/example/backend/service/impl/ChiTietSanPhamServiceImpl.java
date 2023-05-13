package com.example.backend.service.impl;

import com.example.backend.entity.ChiTietSanPham;
import com.example.backend.model.response.ChiTietSanPhamResponse;
import com.example.backend.repository.ChiTietSanPhamRepository;
import com.example.backend.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caodinh
 */
@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPhamResponse> getAll() {
        List<ChiTietSanPhamResponse> chiTietSanPhamResponses = new ArrayList<>();
        for (ChiTietSanPham chiTietSanPham: chiTietSanPhamRepository.findAll()) {
            String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/images/")
                    .path(chiTietSanPham.getImg())
                    .toUriString();
            chiTietSanPhamResponses.add(new ChiTietSanPhamResponse(chiTietSanPham.getId(),chiTietSanPham.getTenSP(),img,chiTietSanPham.getCategory().getTen(),chiTietSanPham.getMoTa(),chiTietSanPham.getNhaSanXuat().getTen(),chiTietSanPham.getGiaBan()));
        }
        return chiTietSanPhamResponses;
    }

    @Override
    public ChiTietSanPhamResponse getOneById(String id) {
        ChiTietSanPham chiTietSanPham = chiTietSanPhamRepository.getReferenceById(id);
        String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/images/")
                .path(chiTietSanPham.getImg())
                .toUriString();
        ChiTietSanPhamResponse chiTietSanPhamResponses = new ChiTietSanPhamResponse(chiTietSanPham.getId(),chiTietSanPham.getTenSP(),img,chiTietSanPham.getCategory().getTen(),chiTietSanPham.getMoTa(),chiTietSanPham.getNhaSanXuat().getTen(),chiTietSanPham.getGiaBan());
        return chiTietSanPhamResponses;
    }
}
