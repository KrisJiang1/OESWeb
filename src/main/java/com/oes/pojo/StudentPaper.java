package com.oes.pojo;


//学生试卷
public class StudentPaper {

  //学生
  private Student student;
  //试卷
  private PaperInfo paperinfo;
  //是否考过
  private Integer isTested;


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

  public Integer getIsTested() {
    return isTested;
  }

  public void setIsTested(Integer isTested) {
    this.isTested = isTested;
  }
}
