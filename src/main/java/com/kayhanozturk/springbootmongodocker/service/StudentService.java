package com.kayhanozturk.springbootmongodocker.service;

import com.kayhanozturk.springbootmongodocker.model.Student;

import java.util.List;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface StudentService {
    List<Student> findAll();
}
