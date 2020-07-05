package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.ExamInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamInfoDao {

    void insertExamInfo(ExamInfo examInfo);

    void updateExamInfo(ExamInfo examInfo);

    void deleteExamInfo(ExamInfo examInfo);

    List<ExamInfo> selectOneExamInfo(ExamInfo examInfo);

    List<ExamInfo> selectAllExamInfo();


}
