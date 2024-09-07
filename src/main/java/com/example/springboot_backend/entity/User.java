package com.example.springboot_backend.entity;

// นำเข้าคลาสจาก Jakarta Persistence API (JPA) เพื่อใช้งานกับฐานข้อมูล
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// ระบุว่าคลาสนี้เป็น Entity ที่จะถูกแมพกับตารางในฐานข้อมูล
@Entity
public class User {

    // ระบุว่า `id` เป็น Primary Key ของ Entity นี้
    @Id
    // ระบุว่าวิธีการสร้างค่า `id` จะเป็นการสร้างอัตโนมัติ โดยใช้กลยุทธ์ IDENTITY ซึ่งหมายความว่า ID จะถูกสร้างและจัดการโดยฐานข้อมูล
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // คอลัมน์ที่เก็บชื่อผู้ใช้
    private String username;

    // คอลัมน์ที่เก็บรหัสผ่าน
    private String password;

    // เมธอดเพื่อดึงค่าของ `id`
    public Long getId() {
        return id;
    }

    // เมธอดเพื่อกำหนดค่าให้กับ `id`
    public void setId(Long id) {
        this.id = id;
    }

    // เมธอดเพื่อดึงค่าของ `username`
    public String getUsername() {
        return username;
    }

    // เมธอดเพื่อกำหนดค่าให้กับ `username`
    public void setUsername(String username) {
        this.username = username;
    }

    // เมธอดเพื่อดึงค่าของ `password`
    public String getPassword() {
        return password;
    }

    // เมธอดเพื่อกำหนดค่าให้กับ `password`
    public void setPassword(String password) {
        this.password = password;
    }
}
