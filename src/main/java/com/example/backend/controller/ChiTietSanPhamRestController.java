package com.example.backend.controller;

import com.example.backend.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author caodinh
 */
@RestController
@RequestMapping("/api/user/chi-tiet-san-pham")
public class ChiTietSanPhamRestController {

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping
    public ResponseEntity<?> getAll() throws IOException {
       return new ResponseEntity<>(chiTietSanPhamService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneProduct(@PathVariable String id){
        return new ResponseEntity<>(chiTietSanPhamService.getOneById(id) ,HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<?> searchProduct(@PathVariable String name){
        return new ResponseEntity<>(chiTietSanPhamService.getAllByName(name) ,HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getAllProductByCateId(@PathVariable String id){
        return new ResponseEntity<>(chiTietSanPhamService.findAllByCateID(id) ,HttpStatus.OK);
    }
}
