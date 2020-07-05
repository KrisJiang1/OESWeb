package com.oes.pojo;

//题目试卷
public class QuestionPaper {

    //试卷
    private PaperInfo paperinfo;
    //题目ID
    private String questionId;


    public PaperInfo getPaperinfo() {
        return paperinfo;
    }

    public void setPaperinfo(PaperInfo paperinfo) {
        this.paperinfo = paperinfo;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

}
