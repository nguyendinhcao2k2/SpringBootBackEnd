package com.example.backend.controller;

import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author caodinh
 */
@RestController
@RequestMapping("/login/oauth2")
public class UserController {


//    @PostMapping("/google")
//    public ResponseEntity<Map<String, Object>> googleLogin(@RequestBody Map<String, String> request,
//                                                           @AuthenticationPrincipal OAuth2User oauth2User) {
//        // Xử lý yêu cầu đăng nhập từ Google và trả về mã thông báo truy cập cho người dùng
//        System.out.println(oauth2User);
//        // ...
//        return ResponseEntity.ok(null);
//    }
}
