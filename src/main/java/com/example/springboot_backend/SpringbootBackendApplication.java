package com.example.springboot_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController // กำหนดให้คลาสนี้เป็น Controller สำหรับ REST API
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	// สร้างเส้นทางสำหรับ API
	@GetMapping("/") // เมื่อเรียก URL http://localhost:7777/ จะทำงานในฟังก์ชันนี้
	public String helloWorld() {
		return "Hello Spring Boot"; // ส่งข้อความ "Hello World" กลับไปที่ผู้เรียก
	}
}
