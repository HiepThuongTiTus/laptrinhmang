//Xây dựng chương trình Client ở chế độ có kết nối
package cau4c4;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;
public class cau4 {
	    public static void main(String[] args) {
	 
	        System.out.println("Create thread 1");
	 
	        Thread Thread1 = new Thread1();
	 
	        System.out.println("Create thread 2");
	        
	        Thread Thread2 = new Thread2();
	        
	        Thread2.setPriority(Thread.MIN_PRIORITY);

	        // Start threads.
	        Thread1.start();
	        Thread2.start();
	 
	    }
	 
	    // Một nhiệm vụ quan trọng, yêu cầu độ ưu tiên cao.
	    static class Thread1 extends Thread {
	        @Override
	        public void run() {
	            int i = 5;
	                System.out.println("\n So ngau nhien la : " + i);
	                
	                try {
	                    Thread1.sleep(2000);
	                } catch (InterruptedException ex) {}
	            printTime();
	        }
	    }
	    static class Thread2 extends Thread {
	        @Override
	        public void run() {
	            int i = 5;
	                System.out.println("\n Binh phuong so ngau nhien la : " + i*i);
	                
	                try {
	                    Thread2.sleep(5000);
	                } catch (InterruptedException ex) {}
	            printTime();
	        }

	        private String Thread3() {
	            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	        }
	    }
	    private static void printTime() {
	     }

}
