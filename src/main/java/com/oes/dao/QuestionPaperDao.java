package com.oes.dao;

import com.oes.pojo.ChoiceQuestion;
import com.oes.pojo.QuestionPaper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionPaperDao {

    void insertQuestionPaper(QuestionPaper questionPaper);

    void updateQuestionPaper(QuestionPaper questionPaper);

    void deleteQuestionPaper(QuestionPaper questionPaper);

    List<QuestionPaper> selectOneQuestionPaper(QuestionPaper questionPaper);

    List<QuestionPaper> selectAllQuestionPaper();


}
