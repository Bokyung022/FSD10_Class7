package June15th;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overloading method

		System.out.println(add(5, 8));
		add(4.5, 8.4);
		add(4, 5, 6);
		add(4, 5.6);

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static double add(int x, int y, int z) {
		return x + y + z;
	}

	public static double add(int x, double y) {
		return x + y;
	}
//overloading method
}
