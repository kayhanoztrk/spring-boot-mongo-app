package com.kayhanozturk.springbootmongodocker.service;

import com.kayhanozturk.springbootmongodocker.model.Student;
import com.kayhanozturk.springbootmongodocker.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
