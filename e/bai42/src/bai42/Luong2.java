package bai42;

public class Luong2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = Nhapab.a+Nhapab.n; i < Nhapab.b-Nhapab.n; i++) {
            if (Nhapab.isPrimeNumber(i)) {
                System.out.print("Luong 2: " + i);
            }
        }
	}
}
