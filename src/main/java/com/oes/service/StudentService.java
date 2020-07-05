package com.oes.service;

import com.oes.pojo.Student;

import java.util.List;

public interface StudentService {

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer studentId);

    List<Student> selectOneStudent(Student student);

    List<Student> selectAllStudent();
}
