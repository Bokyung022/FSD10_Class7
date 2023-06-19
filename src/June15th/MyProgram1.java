package June15th;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = kb.nextInt();
		boolean result = is_leapYear(year);
		if(result) {
			System.out.println("Yes, it is leap");
		} else {
			System.out.println("Nope");
		}

	}
	
	public static boolean is_leapYear(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		return a & b;
	}

}
