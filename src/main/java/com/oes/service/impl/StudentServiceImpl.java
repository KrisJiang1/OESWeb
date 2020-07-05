package com.oes.service.impl;

import com.oes.dao.StudentDao;
import com.oes.pojo.Student;
import com.oes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> selectOneStudent(Student student) {
        return studentDao.selectOneStudent(student);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentDao.selectAllStudent();
    }
}
