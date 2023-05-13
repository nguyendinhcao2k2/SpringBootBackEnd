package com.example.backend.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author caodinh
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSanPhamResponse {

    private String id;
    private String tenSanPham;
    private String sanPhamImg;
    private String cateName;
    private String moTa;
    private String nsx;
    private BigDecimal price;

}
