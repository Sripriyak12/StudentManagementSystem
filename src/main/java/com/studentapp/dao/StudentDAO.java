package com.studentapp.dao;

import java.util.List;
import com.studentapp.model.Student;

public interface StudentDAO {
    void addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
