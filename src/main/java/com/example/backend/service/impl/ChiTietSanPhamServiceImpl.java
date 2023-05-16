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
        List<ChiTietSanPhamResponse> chiTietSanPhamResponses = chiTietSanPhamRepository.findAllChiTietSanPham();
        if (chiTietSanPhamResponses.size() > 0) {
            for (ChiTietSanPhamResponse chiTietSanPhamResponse : chiTietSanPhamResponses) {
                String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/images/")
                        .path(chiTietSanPhamResponse.getSanPhamImg())
                        .toUriString();
                chiTietSanPhamResponse.setSanPhamImg(img);
            }
        }
        return chiTietSanPhamResponses;
    }

    @Override
    public ChiTietSanPhamResponse getOneById(String id) {
        ChiTietSanPhamResponse chiTietSanPhamResponse = chiTietSanPhamRepository.getOneByID(id);
        String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/images/")
                .path(chiTietSanPhamResponse.getSanPhamImg())
                .toUriString();
        chiTietSanPhamResponse.setSanPhamImg(img);
        return chiTietSanPhamResponse;
    }

    @Override
    public List<ChiTietSanPhamResponse> getAllByName(String name) {
        List<ChiTietSanPhamResponse> chiTietSanPhamResponses = chiTietSanPhamRepository.findAllByTenSP(name);
        if(chiTietSanPhamResponses.size() > 0) {
            for (ChiTietSanPhamResponse chiTietSanPhamResponse : chiTietSanPhamResponses) {
                String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/images/")
                        .path(chiTietSanPhamResponse.getSanPhamImg())
                        .toUriString();
               chiTietSanPhamResponse.setSanPhamImg(img);
            }
        }
        return chiTietSanPhamResponses;
    }

    @Override
    public List<ChiTietSanPhamResponse> findAllByCateID(String id) {
        List<ChiTietSanPhamResponse> chiTietSanPhamResponses = chiTietSanPhamRepository.findAllByCategoryId(id);
        if(chiTietSanPhamResponses.size() > 0) {
            for (ChiTietSanPhamResponse chiTietSanPhamResponse : chiTietSanPhamResponses) {
                String img = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/images/")
                        .path(chiTietSanPhamResponse.getSanPhamImg())
                        .toUriString();
                chiTietSanPhamResponse.setSanPhamImg(img);
            }
        }
        return chiTietSanPhamResponses;
    }
}
