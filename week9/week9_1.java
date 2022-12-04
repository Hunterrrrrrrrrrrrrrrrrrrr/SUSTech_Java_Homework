package week9;
import java.io.*;
public class week9_1 {
  static public void main(String [] args) {
    try {
      BufferedReader in = new BufferedReader(new FileReader("Helloworld/src/week9/E1In1.txt"));
      BufferedWriter out = new BufferedWriter(new FileWriter("Out.txt"));
      int temp;
      StringBuilder A = new StringBuilder();
      while((temp = in.read()) != -1) {
        A.append((char)temp);
      }
      for(int i = 0; i < A.length(); i ++) {
        int j = i - 1;
        while(j >= 0 && A.charAt(j) == ' ') j --;
        int k = j - 1;
        while(k >= 0 && A.charAt(k) == ' ') k --;
        if(j < 0 || (A.charAt(j) == '.' && (k < 0 || !Character.isUpperCase(A.charAt(k))))) {
          out.write(Character.toUpperCase(A.charAt(i)));
        } else {
          out.write(A.charAt(i));
        }
      }
      //out.flush();
      
      in.close();
      out.close();
  
  
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
