package com.oes.service;

import com.oes.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                                 
public interface TeacherService {

    void insertTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Integer teacherId);

    List<Teacher> selectOneTeacher(Teacher teacher);

    List<Teacher> selectAllTeacher();
}
