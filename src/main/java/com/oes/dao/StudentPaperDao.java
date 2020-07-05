package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.StudentPaper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentPaperDao {

    void insertStudentPaper(StudentPaper studentPaper);

    void updateStudentPaper(StudentPaper studentPaper);

    void deleteStudentPaper(StudentPaper studentPaper);

    List<StudentPaper> selectOneStudentPaper(StudentPaper studentPaper);

    List<StudentPaper> selectAllStudentPaper();
}

