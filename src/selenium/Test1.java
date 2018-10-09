package selenium;

public class Test1 {
	
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();

	public static void main(String[] args) {
		System.out.println("Hello I am in main");
		printMe();
		t1.scanMe();
		System.out.println(t1.sum());
		Test2.testing1();
		t2.testing2();
		Test3.testing3();
		t3.testing4();

	}
	
	public static void printMe() {
		System.out.println("Print Me");
	}
	
	public void scanMe() {
		System.out.println("Scan Me");
	}
	
	public int sum() {
		int a = 1234;
		return a;
		
	}

}
