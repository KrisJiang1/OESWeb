package com.oes.service;

import com.oes.pojo.StudentPaper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentPaperService {

    void insertStudentPaper(StudentPaper studentPaper);

    void updateStudentPaper(StudentPaper studentPaper);

    void deleteStudentPaper(StudentPaper studentPaper);

    List<StudentPaper> selectOneStudentPaper(StudentPaper studentPaper);

    List<StudentPaper> selectAllStudentPaper();
}

