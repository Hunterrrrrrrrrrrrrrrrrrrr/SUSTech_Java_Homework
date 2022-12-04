package assignment4;

import static java.lang.Math.max;
import static java.lang.Math.min;
enum WeekType {
  Odd, Even, Every
}
public class SUSTechTime {
  private String startTime, endTime;
  private Weekday weekday;
  private WeekType weekType;
  SUSTechTime(String startTime, String endTime, Weekday weekday, WeekType weekType) {
    this.startTime = startTime;
    this.endTime = endTime;
    this.weekday = weekday;
    this.weekType = weekType;
  }
  static private int intTime(String s) {
    String []str = s.split(":");
    return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
  }
  
  public String getStartTime() {
    return startTime;
  }
  
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }
  
  public String getEndTime() {
    return endTime;
  }
  
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }
  
  public Weekday getWeekday() {
    return weekday;
  }
  
  public void setWeekday(Weekday weekday) {
    this.weekday = weekday;
  }
  
  public WeekType getWeekType() {
    return weekType;
  }
  
  public void setWeekType(WeekType weekType) {
    this.weekType = weekType;
  }
  
  public String toString() {
    return "SUSTechTime{" + startTime + " ~ " + endTime + " | " + weekday + " | " + weekType + " week}";
  }
  public boolean conflict(SUSTechTime time) {
    if(weekday != time.weekday)
      return false;
    if(weekType != WeekType.Every && time.getWeekType() != WeekType.Every && weekType != time.getWeekType())
      return false;
    int l1 = intTime(startTime), r1 = intTime(endTime) - 1;
    int l2 = intTime(time.getStartTime()), r2 = intTime(time.getEndTime()) - 1;
    if(max(l1, l2) <= min(r1, r2)) {
      return true;
    }
    return false;
  }
}
