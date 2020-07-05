package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                                 
public interface TeacherDao {

    void insertTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Integer teacherId);

    List<Teacher> selectOneTeacher(Teacher teacher);

    List<Teacher> selectAllTeacher();
}
