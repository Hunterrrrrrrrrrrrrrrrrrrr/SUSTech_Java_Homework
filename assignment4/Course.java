package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Course {
  private String teacherName;
  private String courseName;
  private String courseID;
  private int classID;
  private ArrayList<SUSTechTime> timeList;
  private ArrayList<Student> registerList, List;
  private int capacity;
  
  public ArrayList<Student> getList() {
    return List;
  }
  
  public void setList(ArrayList<Student> list) {
    List = list;
  }
  
  public Course(String teacherName, String courseName, String courseID, int classID, ArrayList<SUSTechTime> timeList, int capacity) {
    this.teacherName = teacherName;
    this.courseName = courseName;
    this.courseID = courseID;
    this.classID = classID;
    this.timeList = timeList;
    this.capacity = capacity;
    registerList = new ArrayList<Student>();
  }
  
  public ArrayList<Student> getRegisterList() {
    return registerList;
  }
  public String getTeacherName() {
    return teacherName;
  }
  
  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  
  public String getCourseID() {
    return courseID;
  }
  
  public void setCourseID(String courseID) {
    this.courseID = courseID;
  }
  
  public int getClassID() {
    return classID;
  }
  
  public void setClassID(int classID) {
    this.classID = classID;
  }
  
  public ArrayList<SUSTechTime> getTimeList() {
    return timeList;
  }
  
  public void setTimeList(ArrayList<SUSTechTime> timeList) {
    this.timeList = timeList;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
  
  @Override
  public String toString() {
    return "Course{" + this.getCourseID() + " " + this.getCourseName() + "-class " + this.getClassID() + " | " + this.getCapacity() + "}";
  }
  
  public boolean equals(Course obj) {
    return teacherName.equals(obj.teacherName) && courseName.equals(obj.courseName) && courseID.equals(obj.courseID)
        && classID == obj.classID && capacity == obj.capacity;
  }
  public boolean conflict(Course course) {
    for(SUSTechTime u : timeList)
      for(SUSTechTime v : course.getTimeList())
        if(u.conflict(v))
          return true;
    return false;
  }
  public int removeStudent(int studentID) {
    for(int i = 0; i < registerList.size(); i ++) {
      if(registerList.get(i).getStudentID() == studentID) {
        registerList.remove(i);
        return registerList.get(i).getRemainingCredit();
      }
    }
    return -1;
  }
  public void generateList() {
    //ArrayList<Integer> a = new ArrayList<Integer>();
    //Collections.sort(a);
    
    
    List = new ArrayList<Student>();
    for(Student stu : registerList)
      List.add(new Student(stu.getStudentID(), stu.getRemainingCredit()));
    Collections.sort(List, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o2.getRemainingCredit() - o1.getRemainingCredit();
      }
    });
    while(List.size() > capacity) List.remove(List.size() - 1);
  }
}
