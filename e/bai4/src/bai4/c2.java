package bai4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c2 {
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) throws IOException {
	        // TODO code application logic here
	        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Nhap a: ");
	        String s=kbd.readLine();
	        int a=Integer.parseInt(s);
	        System.out.print("Nhap b: ");
	        s=kbd.readLine();
	        int b=Integer.parseInt(s);
	        for(int i = a;i<=b;i++)
	        {
	            int dem = 0;
	            for(int j = 2;j<=i;j++)
	            {
	                if(i%j==0)
	                {
	                   dem+=1;
	                }
	            }
	            if(dem<=1)
	            {
	            System.out.println(i);
	            }
	        }
	    }
	    
}