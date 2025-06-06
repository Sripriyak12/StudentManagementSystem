package com.studentapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.studentapp.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            student.setCourse(rs.getString("course"));
            student.setAge(rs.getInt("age"));
            return student;
        }
    }

    @Override
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (name, email, course, age) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getCourse(), student.getAge());
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name=?, email=?, course=?, age=? WHERE id=?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getCourse(), student.getAge(), student.getId());
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
