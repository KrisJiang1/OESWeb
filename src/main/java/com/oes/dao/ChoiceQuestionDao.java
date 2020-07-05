package com.oes.dao;

import com.oes.pojo.Admin;
import com.oes.pojo.ChoiceQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceQuestionDao {

    void insertChoiceQuestion(ChoiceQuestion choiceQuestion);

    void updateChoiceQuestion(ChoiceQuestion choiceQuestion);

    void deleteChoiceQuestion(Integer questionId);

    List<ChoiceQuestion> selectOneChoiceQuestion(ChoiceQuestion choiceQuestion);

    List<ChoiceQuestion> selectAllChoiceQuestion();
}
