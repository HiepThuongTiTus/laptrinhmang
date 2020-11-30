package bai2;
import java.io.PrintWriter;


public class MainServer {

   
   public static void main(String[] args) {
      ServerSum S = new ServerSum(8080);
      PrintWriter output = new PrintWriter(System.out);
      output.println("Server đã chạy và chờ kết nối từ Client...");
      S.start();

   }

}