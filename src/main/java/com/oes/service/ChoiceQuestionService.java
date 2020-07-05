package com.oes.service;

import com.oes.pojo.ChoiceQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ChoiceQuestionService {

    void insertChoiceQuestion(ChoiceQuestion choiceQuestion);

    void updateChoiceQuestion(ChoiceQuestion choiceQuestion);

    void deleteChoiceQuestion(Integer questionId);

    List<ChoiceQuestion> selectOneChoiceQuestion(ChoiceQuestion choiceQuestion);

    List<ChoiceQuestion> selectAllChoiceQuestion();
}
