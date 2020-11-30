package bai2;
import java.io.PrintWriter;
import java.util.Scanner;


public class MainClient {

   public static void main(String[] args) {
      PrintWriter output = new PrintWriter(System.out);
      Scanner input = new Scanner(System.in);
      String address = "192.168.57.1";
      int port = 445;
      output.println("Client run....!");
      output.flush();
      output.print("Nhập địa chỉ Server: ");
      output.flush();
      address = input.nextLine();
      output.print("Nhập cổng port: ");
      output.flush();
      port = input.nextInt();
      ClientSum C = new ClientSum(address, port);
      while(true){
         C.connected();
         if (C.connect) {
            C.InputString();
            C.Send();
            C.Recived();
            C.Look();
            C.disconnect();
         } else {
            output.print("Kết nối Server thất bại! ");
            output.flush();
         }
         }
   }
}