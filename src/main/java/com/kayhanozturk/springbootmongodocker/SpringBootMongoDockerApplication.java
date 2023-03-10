package com.kayhanozturk.springbootmongodocker;

import com.kayhanozturk.springbootmongodocker.exception.StudentNotFoundException;
import com.kayhanozturk.springbootmongodocker.model.Address;
import com.kayhanozturk.springbootmongodocker.model.Gender;
import com.kayhanozturk.springbootmongodocker.model.Student;
import com.kayhanozturk.springbootmongodocker.repository.StudentRepository;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootMongoDockerApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDockerApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}")
                                 String description, @Value("${application-version")
                                 String version) {
        return new OpenAPI()
                .info(new Info().title("Spring Boot MongoDB Sample")
                        .version(version)
                        .description(description)
                        .license(new License().name("Spring Boot MongoDB Sample API Licence")));
    }

    @Override
    public void run(String... args) throws Exception {
        com.kayhanozturk.springbootmongodocker.model.Address address =
                new Address("England", "London",
                        "KOX");
        Student student = new Student("James",
                "Hetfield", "james.hetfield@gmail.com",
                Gender.MALE, address,
                Arrays.asList("Guitarist"),
                BigDecimal.TEN,
                LocalDateTime.now()
        );
        studentRepository.save(student);

     //   Student student1 = studentRepository.findStudentByEmail("email@gmail.com")
       //         .orElseThrow(() -> new StudentNotFoundException("studentNotFound!"));

/*
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is("james.hetfield@gmail.com"));

        List<Student> studentList = mongoTemplate.find(query, Student.class);

        if (studentList.size() > 1) {
            throw new IllegalStateException("found many students with that email ");
        }
        if (studentList.isEmpty()) {
            System.out.println("inserting student info!");
            studentRepository.insert(student);
        } else {
            System.out.println(student + " already exists!");
        }
*/

    }
}
