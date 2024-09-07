package com.example.springboot_backend.controller;

// นำเข้าคลาสที่เกี่ยวข้อง
import com.example.springboot_backend.entity.User;
import com.example.springboot_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// ระบุว่าคลาสนี้เป็น REST controller ซึ่งจะจัดการกับคำร้องขอ HTTP
@RestController
// ระบุ URL path หลักของ REST API สำหรับคลาสนี้
@RequestMapping("/getAll/users")
public class UserController {

    // การฉีดพึ่งพา (Dependency Injection) ของ UserService
    @Autowired
    private UserService userService;

    // ระบุว่าคลาสนี้มีเมธอดที่รับ HTTP GET request
    @GetMapping
    public List<User> getAllUsers() {
        // เรียกใช้เมธอด getAllUsers จาก UserService เพื่อดึงข้อมูลผู้ใช้ทั้งหมด
        return userService.getAllUsers();
    }
}
