package assignment4;

import java.util.ArrayList;

public class CourseDatabase {
  private ArrayList<Course> courseList;
  public CourseDatabase() {
    courseList = new ArrayList<Course>();
  }
  
  public ArrayList<Course> getCourseList() {
    return courseList;
  }
  
  public void setCourseList(ArrayList<Course> courseList) {
    this.courseList = courseList;
  }
  
  public void addCourse(Course newCourse) {
    courseList.add(newCourse);
  }
  public void removeCourse(String courseID, int classID) {
    for(int i = 0; i < courseList.size(); i ++) {
      if(courseList.get(i).getCourseID().equals(courseID) && courseList.get(i).getClassID() == classID) {
        courseList.remove(i);
        break;
      }
    }
  }
  public void removeCourse(Course course) {
    for(int i = 0; i < courseList.size(); i ++) {
      if(courseList.get(i).equals(course)) {
        courseList.remove(i);
        break;
      }
    }
  }
  public ArrayList<Course> searchCourseByID(String courseID) {
    ArrayList<Course> result = new ArrayList<Course>();
    for(int i = 0; i < courseList.size(); i ++) {
      if(courseList.get(i).getCourseID().equals(courseID)) {
        result.add(courseList.get(i));
      }
    }
    return result;
  }
  public ArrayList<Course> searchCourseByTeacherName(String teacherName) {
    ArrayList<Course> result = new ArrayList<Course>();
    for(int i = 0; i < courseList.size(); i ++) {
      if(courseList.get(i).getTeacherName().equals(teacherName)) {
        result.add(courseList.get(i));
      }
    }
    return result;
  }
  
  public ArrayList<Course> searchCourseByCourseName(String courseName) {
    ArrayList<Course> result = new ArrayList<Course>();
    for(int i = 0; i < courseList.size(); i ++) {
      if(courseList.get(i).getCourseName().equals(courseName)) {
        result.add(courseList.get(i));
      }
    }
    return result;
  }
  public ArrayList<Course> searchCourseByCourseTime(String startTime, String endTime) {
    ArrayList<Course> result = new ArrayList<Course>();
    for(int i = 0; i < courseList.size(); i ++) {
      boolean ok = false;
      for(SUSTechTime time: courseList.get(i).getTimeList()) {
        if(time.getStartTime().equals(startTime) && time.getEndTime().equals(endTime)) {
          ok = true;
          break;
        }
      }
      if(ok) {
        result.add(courseList.get(i));
      }
    }
    return result;
  }
}
