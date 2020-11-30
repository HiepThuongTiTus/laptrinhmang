package bai42;

import java.util.Scanner;

public class Nhapab extends Thread{
	public static int a,b;
	public static int n;
	@Override
	public void run() {

		super.run();
		n=(a+b)/2;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("nhap a: ");
			a=sc.nextInt();
			System.out.println("nhap b: ");
			b=sc.nextInt();
		}	
	}
	public static boolean isPrimeNumber(int n) {
	    if (n < 2) {
	        return false;
	    }
	    // check so nguyen to khi n >= 2
	    int squareRoot = (int) Math.sqrt(n);
	    for (int i = 2; i <= squareRoot; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
