package com.kayhanozturk.springbootmongodocker.repository;

import com.kayhanozturk.springbootmongodocker.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findStudentByEmail(String email);
}
