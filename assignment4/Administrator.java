package assignment4;

import java.util.ArrayList;

public class Administrator {
  private ArrayList<Student> studentList;
  private CourseDatabase database;
  public Administrator() {
    studentList = new ArrayList<Student>();
    database = new CourseDatabase();
  }
  public void addStudent(Student student) {
    studentList.add(student);
  }
  public void addStudent(int studentID) {
    studentList.add(new Student(studentID));
  }
  
  public CourseDatabase getDatabase() {
    return database;
  }
  
  public void generateCurriculum() {
    for(Course course: database.getCourseList()) {
      course.generateList();
    }
    for(Student stu : studentList) {
      stu.setCurriculum(new ArrayList<Course>());
      for(Course course : database.getCourseList()) {
        boolean ok = false;
        for (Student ss : course.getList()) {
          if (ss.getStudentID() == stu.getStudentID()) {
            ok = true;
            break;
          }
        }
        if(ok)
          stu.getCurriculum().add(course);
      }
    }
  }
}
