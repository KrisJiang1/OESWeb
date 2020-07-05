package com.oes.pojo;

//选择题
public class ChoiceQuestion {

  //题目ID
  private Integer quesId;
  //题目内容
  private String quesContent;
  //选项A
  private String quesOptionA;
  //选项B
  private String quesOptionB;
  //选项C
  private String quesOptionC;
  //选项D
  private String quesOptionD;
  //答案
  private String quesAnswer;


  public Integer getQuesId() {
    return quesId;
  }

  public void setQuesId(Integer quesId) {
    this.quesId = quesId;
  }


  public String getQuesContent() {
    return quesContent;
  }

  public void setQuesContent(String quesContent) {
    this.quesContent = quesContent;
  }


  public String getQuesOptionA() {
    return quesOptionA;
  }

  public void setQuesOptionA(String quesOptionA) {
    this.quesOptionA = quesOptionA;
  }


  public String getQuesOptionB() {
    return quesOptionB;
  }

  public void setQuesOptionB(String quesOptionB) {
    this.quesOptionB = quesOptionB;
  }


  public String getQuesOptionC() {
    return quesOptionC;
  }

  public void setQuesOptionC(String quesOptionC) {
    this.quesOptionC = quesOptionC;
  }


  public String getQuesOptionD() {
    return quesOptionD;
  }

  public void setQuesOptionD(String quesOptionD) {
    this.quesOptionD = quesOptionD;
  }


  public String getQuesAnswer() {
    return quesAnswer;
  }

  public void setQuesAnswer(String quesAnswer) {
    this.quesAnswer = quesAnswer;
  }

}
