package com.example.springboot_backend;

// นำเข้าคลาส Test จาก JUnit 5
import org.junit.jupiter.api.Test;
// นำเข้าคลาส SpringBootTest จาก Spring Boot
import org.springframework.boot.test.context.SpringBootTest;

// ใช้ annotation @SpringBootTest เพื่อระบุว่าเป็นการทดสอบ Spring Boot application
@SpringBootTest
class SpringbootBackendApplicationTests {

    // ใช้ annotation @Test เพื่อระบุว่าเป็นเมธอดทดสอบ
    @Test
    void contextLoads() {
        // เมธอดทดสอบนี้จะตรวจสอบว่า ApplicationContext สามารถโหลดได้โดยไม่มีข้อผิดพลาด
    }
}
