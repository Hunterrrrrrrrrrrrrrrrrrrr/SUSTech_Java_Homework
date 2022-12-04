
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class GreetingClient  {
  public static void main(String [] args)  {
    String serverName = args[0];
    int port = Integer.parseInt(args[1]);
    try {
      //Socket
      //getRemoteSocketAddress
      System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
      Socket client = new Socket(serverName, port);
      System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
      
      DataOutputStream out = new DataOutputStream(client.getOutputStream());
      DataInputStream in = new DataInputStream(client.getInputStream());
  
      Scanner stdin = new Scanner(System.in);
      while(true) {
        String s = stdin.nextLine();
        out.writeUTF(s);
        if(s.equals("exit"))
          break;
        System.out.println(in.readUTF());
      }
      
      client.close();
    } catch(IOException e)  {
      e.printStackTrace();
    }
  }
}