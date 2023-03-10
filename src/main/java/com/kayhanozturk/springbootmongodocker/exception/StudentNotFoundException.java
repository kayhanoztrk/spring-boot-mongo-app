package com.kayhanozturk.springbootmongodocker.exception;

import com.kayhanozturk.springbootmongodocker.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
