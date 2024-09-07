package com.example.springboot_backend.service;

// นำเข้าคลาส User entity
import com.example.springboot_backend.entity.User;
// นำเข้าคลาส List จาก java.util สำหรับการจัดการกับรายการของ User
import java.util.List;

// ประกาศ interface ที่จะใช้สำหรับการบริการข้อมูลของผู้ใช้
public interface UserService {
    // เมธอดที่ใช้สำหรับดึงข้อมูลผู้ใช้ทั้งหมด
    List<User> getAllUsers();
    
    // เมธอดที่ใช้สำหรับดึงข้อมูลผู้ใช้โดยใช้ ID
    User getUserById(Long id);
    
    // สามารถเพิ่มเมธอดบริการอื่น ๆ ที่ต้องการได้ที่นี่
}
