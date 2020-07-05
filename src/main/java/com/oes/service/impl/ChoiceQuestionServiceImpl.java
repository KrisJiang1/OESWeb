package com.oes.service.impl;

import com.oes.dao.ChoiceQuestionDao;
import com.oes.pojo.ChoiceQuestion;
import com.oes.service.ChoiceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceQuestionServiceImpl implements ChoiceQuestionService {

    @Autowired
    ChoiceQuestionDao choiceQuestionDao;

    @Override
    public void insertChoiceQuestion(ChoiceQuestion choiceQuestion) {
        choiceQuestionDao.insertChoiceQuestion(choiceQuestion);
    }

    @Override
    public void updateChoiceQuestion(ChoiceQuestion choiceQuestion) {
        choiceQuestionDao.updateChoiceQuestion(choiceQuestion);
    }

    @Override
    public void deleteChoiceQuestion(Integer questionId) {
        choiceQuestionDao.deleteChoiceQuestion(questionId);
    }

    @Override
    public List<ChoiceQuestion> selectOneChoiceQuestion(ChoiceQuestion choiceQuestion) {
        return choiceQuestionDao.selectOneChoiceQuestion(choiceQuestion);
    }

    @Override
    public List<ChoiceQuestion> selectAllChoiceQuestion() {
        return choiceQuestionDao.selectAllChoiceQuestion();
    }
}
