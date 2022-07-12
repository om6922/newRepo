package demo;

public class DemoGit {

	public int sub(int a, int b) {
		return a - b;

	}

	public int sub2(int a, int b) {
		return a - b;

	}
	
	
	public static void main(String[] args) {
		DemoGit d = new DemoGit();

		System.out.println(d.sub(50, 40));
		DemoGit d2 = new DemoGit();

		System.out.println(d2.sub2(50, 40));

	}

}
