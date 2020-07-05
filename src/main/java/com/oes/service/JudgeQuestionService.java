package com.oes.service;

import com.oes.pojo.JudgeQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JudgeQuestionService {

    void insertJudgeQuestion(JudgeQuestion judgeQuestion);

    void updateJudgeQuestion(JudgeQuestion judgeQuestion);

    void deleteJudgeQuestion(Integer questionId);

    List<JudgeQuestion> selectOneJudgeQuestion(JudgeQuestion judgeQuestion);

    List<JudgeQuestion> selectAllJudgeQuestion();
}
