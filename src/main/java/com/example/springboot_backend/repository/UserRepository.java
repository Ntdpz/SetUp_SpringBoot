package com.example.springboot_backend.repository;

// นำเข้าคลาส User entity
import com.example.springboot_backend.entity.User;
// นำเข้าคลาส JpaRepository จาก Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// ประกาศ interface ที่จะใช้สำหรับการเข้าถึงข้อมูลในฐานข้อมูล
public interface UserRepository extends JpaRepository<User, Long> {
    // สามารถเพิ่ม custom queries ที่นี่หากจำเป็น
}
