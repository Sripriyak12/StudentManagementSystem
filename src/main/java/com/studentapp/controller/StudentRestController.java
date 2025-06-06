package com.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentapp.dao.StudentDAO;
import com.studentapp.model.Student;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentDAO.getStudentById(id);
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentDAO.addStudent(student);
        return "Student added successfully!";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        studentDAO.updateStudent(student);
        return "Student updated successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentDAO.deleteStudent(id);
        return "Student deleted successfully!";
    }
}
