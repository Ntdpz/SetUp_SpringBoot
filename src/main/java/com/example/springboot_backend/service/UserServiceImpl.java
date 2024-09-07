package com.example.springboot_backend.service;

// นำเข้าคลาส User entity
import com.example.springboot_backend.entity.User;
// นำเข้าคลาส UserRepository สำหรับการเข้าถึงข้อมูล
import com.example.springboot_backend.repository.UserRepository;
// นำเข้าคลาส Autowired และ Service จาก Spring Framework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// ประกาศคลาสที่ implement UserService interface และระบุว่าเป็น Service ของ Spring
@Service
public class UserServiceImpl implements UserService {

    // ใช้ Autowired เพื่อให้ Spring จัดการการฉีด Dependency ของ UserRepository
    @Autowired
    private UserRepository userRepository;

    // Override เมธอด getAllUsers() จาก UserService interface
    @Override
    public List<User> getAllUsers() {
        // เรียกใช้เมธอด findAll() จาก UserRepository เพื่อดึงข้อมูลผู้ใช้ทั้งหมด
        return userRepository.findAll();
    }

    // Override เมธอด getUserById() จาก UserService interface
    @Override
    public User getUserById(Long id) {
        // เรียกใช้เมธอด findById() จาก UserRepository เพื่อดึงข้อมูลผู้ใช้ตาม ID
        // ใช้ orElse(null) เพื่อคืนค่า null ถ้าไม่พบผู้ใช้ที่มี ID ตรงกัน
        return userRepository.findById(id).orElse(null);
    }

    // สามารถ implement เมธอดอื่น ๆ ตามที่จำเป็นได้ที่นี่
}
