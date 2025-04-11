package com.studentdata.StudentManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    private final StudentRepository repo;
    private final Logger logger = LoggerFactory.getLogger(StudentController.class);

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        logger.info("Fetching all students");
        return repo.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        logger.info("Student with ID {}", id);
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found: " + id));
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        logger.info("Creating new student: {}", student.getName());
        repo.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        logger.info("Updating student with ID {}", id);
        return repo.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setPercentage(updatedStudent.getPercentage());
            student.setBranch(updatedStudent.getBranch());
            return repo.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found: " + id));
    }

    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id) {
        logger.warn("Deleting student {}", id);
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found: " + id));
        repo.delete(student);
    }
}
