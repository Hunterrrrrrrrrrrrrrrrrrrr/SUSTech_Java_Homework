package week12;

import java.util.ArrayList;

public class Exercise2 {
  public static void main(String[] args) {
    ArrayList<Animal> mArray = new ArrayList<Animal>();
    
    for(int i = 0; i < 6; i ++)
      if(i % 2 == 1)
        mArray.add(new Human());
      else
        mArray.add(new Monkey());
    for(Animal monkey: mArray)
      monkey.speak();
  }
}