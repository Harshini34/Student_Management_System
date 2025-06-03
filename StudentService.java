package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Optional<Student> getStudentById(Long id);
    void deleteStudent(Long id);
    List<Student> searchByName(String name);
    List<Student> searchByClass(String studentClass);
}
