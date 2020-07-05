package com.oes.pojo;


import java.sql.Date;

public class PaperInfo {

  private Integer paperId;
  private String paperName;
  private Teacher teacher;
  private Date paperDate;
  private Date paperTime;


  public Integer getPaperId() {
    return paperId;
  }

  public void setPaperId(Integer paperId) {
    this.paperId = paperId;
  }

  public String getPaperName() {
    return paperName;
  }

  public void setPaperName(String paperName) {
    this.paperName = paperName;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Date getPaperDate() {
    return paperDate;
  }

  public void setPaperDate(Date paperDate) {
    this.paperDate = paperDate;
  }

  public Date getPaperTime() {
    return paperTime;
  }

  public void setPaperTime(Date paperTime) {
    this.paperTime = paperTime;
  }
}
