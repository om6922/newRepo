package demo;

public class DemoTest {
int a=10;
int b=20;
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add1() {
		int c=a+b;
		System.out.println(c);
	}
	
	public int add2(int a, int b) {
		return  a+b;
		
	}
	
	public static void main(String[] args) {
	DemoTest d=new DemoTest();
	DemoTest d1=new DemoTest();
	DemoTest d2=new DemoTest();
	d.add(10, 60);
	d1.add1();
	System.out.println(d2.add2(50, 40));
	
	

	}

}
