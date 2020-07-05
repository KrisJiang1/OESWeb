package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.JudgeQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudgeQuestionDao {

    void insertJudgeQuestion(JudgeQuestion judgeQuestion);

    void updateJudgeQuestion(JudgeQuestion judgeQuestion);

    void deleteJudgeQuestion(Integer questionId);

    List<JudgeQuestion> selectOneJudgeQuestion(JudgeQuestion judgeQuestion);

    List<JudgeQuestion> selectAllJudgeQuestion();
}
