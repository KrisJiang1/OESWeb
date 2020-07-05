package com.oes.service;

import com.oes.pojo.ExamInfo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ExamInfoService {

    void insertExamInfo(ExamInfo examInfo);

    void updateExamInfo(ExamInfo examInfo);

    void deleteExamInfo(ExamInfo examInfo);

    List<ExamInfo> selectOneExamInfo(ExamInfo examInfo);

    List<ExamInfo> selectAllExamInfo();


}
