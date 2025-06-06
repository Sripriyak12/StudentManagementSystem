package com.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.studentapp.dao.StudentDAO;
import com.studentapp.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/")
    public String listStudents(Model model) {
        List<Student> students = studentDAO.getAllStudents();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        if (student.getId() == 0) {
            studentDAO.addStudent(student);
        } else {
            studentDAO.updateStudent(student);
        }
        return "redirect:/students/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Student student = studentDAO.getStudentById(id);
        model.addAttribute("student", student);
        return "student-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentDAO.deleteStudent(id);
        return "redirect:/students/";
    }
}
