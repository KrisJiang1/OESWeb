package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer studentId);

    List<Student> selectOneStudent(Student student);

    List<Student> selectAllStudent();
}

