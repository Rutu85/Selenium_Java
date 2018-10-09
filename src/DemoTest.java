
public class DemoTest {

	public static void main(String[] args) {
		
		foo();

	}

	private static void foo() {
		int x = 4;
		String y = "rutu";
		x = mee(x,y);
		System.out.println(x + " -- " + y);
		
	}

	private static int mee(int x, String y) {
		x = x+6;
		y="asdfg";
		return x;
	}

}
