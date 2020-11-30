package MultiThreading;

public class C21 {
	public static void main(String argv[])
	{
		try
		{
			InChan ic = new InChan("So Chan", 250);
			InLe il = new InLe("So le",255);
			InNhoHonN nh= new InNhoHonN("Nho hon N", 200);
			InHoa ih = new InHoa("In hoa");
		}
		catch(Exception ie)
		{
			System.out.println("Pipe Echo Error: "+ie);
		}
	}
}
 class InLe extends Thread{
	 String name;
	 private final int n;
	 InLe(String name, int n)
	 {
		 this.name= name;
		 this.n=n;
		 System.out.println("Tao luong "+name);
		 start();
	 }
	 public void run()
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(j%2!=0)
				 System.out.println("So le: "+j);
		 }
	 }
	 
 }
 class InChan extends Thread{
	 String name;
	 private final int n;
	 InChan(String name, int n)
	 {
		 this.name= name;
		 this.n=n;
		 System.out.println("Tao luong "+name);
		 start();
	 }
	 public void run()
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(j%2==0)
				 System.out.println("So chan: "+j);
		 }
	 }
	 
 }
 class InNhoHonN extends Thread{
	 String name;
	 private final int n;
	 InNhoHonN(String name, int n)
	 {
		 this.name= name;
		 this.n=n;
		 System.out.println("Tao luong "+name);
		 start();
	 }
	 public void run()
	 {
		 for(int j=0;j<n;j++)
		 {
				 System.out.println("So nho hon: "+n+": "+j);
		 }
	 }
 }
 class InHoa extends Thread{
	 String name;
	 InHoa(String name)
	 {
		 this.name= name;
		 System.out.println("Tao luong "+name);
		 start();
	 }
	 public void run()
	 {
		 for(int j=65;j<91;j++)
		 {
				 System.out.println("Ky tu: "+(char)j);
		 }
	 }
 }