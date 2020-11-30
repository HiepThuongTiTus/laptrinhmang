
class Main { 
	public Main() 
	{ array = new int[10]; 
	for (int i = 0; i < array.length; i++) 
	{ array[i] = ran.nextInt(10); 
	} }
int[] array; 
Random ran = new Random();
public void sapXep(int startNum, int endNum) { 
	for (int i = startNum; i < endNum - 1; i++) 
	{ for (int j = i + 1; j < endNum; j++) { 
		if (array[i] > array[j]) {
			int temp = array[i]; array[i] = array[j]; array[j] = temp; } } } }
public void in(int startNum, int endNum) { 
	for (int i = startNum; i < endNum; i++) 
	{ System.out.println(array[i] + " "); 
} } } 
// <<<< extend the class Main >>>>>>> class TaoLuong extends Main implements Runnable { public TaoLuong(int startNum, int endNum) { this.startNum = startNum; this.endNum = endNum; }

int startNum, endNum; @Override public void run() { //synchronized (main) { sapXep(startNum, endNum); in(startNum, endNum); //} } }
public class SapXep { public static void main(String[] args) {
	Main main = new Main();
TaoLuong taoLuong1 = new TaoLuong(0, main.array.length / 2); 
Thread t1 = new Thread(taoLuong1); t1.start(); 
TaoLuong taoLuong2 = new TaoLuong(main.array.length / 2, main.array.length); 
Thread t2 = new Thread(taoLuong2); t2.start(); } }}

