package com.oes.service;

import com.oes.pojo.QuestionPaper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface QuestionPaperService {

    void insertQuestionPaper(QuestionPaper questionPaper);

    void updateQuestionPaper(QuestionPaper questionPaper);

    void deleteQuestionPaper(QuestionPaper questionPaper);

    List<QuestionPaper> selectOneQuestionPaper(QuestionPaper questionPaper);

    List<QuestionPaper> selectAllQuestionPaper();


}
