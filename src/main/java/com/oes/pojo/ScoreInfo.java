package com.oes.pojo;

//分数信息
public class ScoreInfo {

  //学生
  private Student student;
  //试卷
  private PaperInfo paperinfo;
  //分数
  private String score;

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public PaperInfo getPaperinfo() {
    return paperinfo;
  }

  public void setPaperinfo(PaperInfo paperinfo) {
    this.paperinfo = paperinfo;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }
}
