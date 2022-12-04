package assignment4;

import java.util.ArrayList;

public class Student {
  private int studentID;
  private ArrayList<Course> curriculum;
  
  private int remainingCredit;
  private int credit; //
  public int getStudentID() {
    return studentID;
  }
  
  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }
  
  public void setCurriculum(ArrayList<Course> curriculum) {
    this.curriculum = curriculum;
  }
  
  public int getRemainingCredit() {
    return remainingCredit;
  }
  
  public void setRemainingCredit(int remainingCredit) {
    this.remainingCredit = remainingCredit;
  }
  
  public ArrayList<Course> getCurriculum() {
    return curriculum;
  }
  
  public Student(int studentID) {
    this.studentID = studentID;
    remainingCredit = 100;
    curriculum = new ArrayList<Course>();
  }
  public Student(int studentID, int credit) {
    this.studentID = studentID;
    remainingCredit = credit;
    curriculum = new ArrayList<Course>();
  }
  public boolean selectCourse(Course course, int credit) {
    if(remainingCredit < credit) return false;
    for(Course pre: curriculum)
      if(pre.conflict(course))
        return false;
    curriculum.add(course);
    remainingCredit -= credit;
    course.getRegisterList().add(new Student(studentID, credit));
    return true;
  }
  public void dropCourse(Course course) {
    int credit = 0;
    for(Course pre: curriculum)
      if(pre.equals(course)) {
        credit = pre.removeStudent(studentID);
        break;
      }
    remainingCredit += credit;
  }
  public void changeCredit(Course course, int credit) {
    for(Student stu : course.getRegisterList()) {
      if(stu.getStudentID() == studentID) {
        remainingCredit += stu.getRemainingCredit() - credit;
        stu.setRemainingCredit(credit);
      }
    }
  }
}
