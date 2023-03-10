package com.kayhanozturk.springbootmongodocker.controller;

import com.kayhanozturk.springbootmongodocker.model.Student;
import com.kayhanozturk.springbootmongodocker.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        List<Student> studentList = studentService.findAll();
        return ResponseEntity.ok(studentList);
    }
}
