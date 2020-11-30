package bai42;

public class main{
	public static void main(String[] args) throws InterruptedException {
		Nhapab ab =new Nhapab();
		ab.start();
		synchronized (ab)
		{
			ab.wait();
		}
		Luong1 l1 = new Luong1();
		Luong2 l2= new Luong2();
		Luong3 l3 = new Luong3();
		l3.start();
		l2.start();
		l1.start();		
		
	}
}		

