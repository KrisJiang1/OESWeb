package com.oes.pojo;


import java.sql.Date;

//考试信息
public class ExamInfo {

  //学生
  private Student student;
  //试卷
  private PaperInfo paperinfo;
  //开始时间
  private Date startTime;
  //结束时间
  private Date endTime;
  //剩余时间
  private Date spareTime;

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

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Date getSpareTime() {
    return spareTime;
  }

  public void setSpareTime(Date spareTime) {
    this.spareTime = spareTime;
  }
}
