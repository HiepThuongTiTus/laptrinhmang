package bai42;

public class Luong3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = Nhapab.b-Nhapab.n; i < Nhapab.b; i++) {
            if (Nhapab.isPrimeNumber(i)) {
                System.out.print("Luong 3: " + i);
            }
        }
	}
}
