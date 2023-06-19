package June15th;

import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		int[] ar1 = new int[10];
		ar1[0] = 2;
		ar1[1] = 5;
		ar1[2] = 77;
		ar1[3] = 22;
		ar1[4] = 99;
		ar1[5] = 18;
		ar1[6] = 22;
		ar1[7] = 7;
		ar1[8] = 12;
		ar1[9] = 81;

		int i;
		System.out.println("Enter the number: ");
		int num = kb.nextInt();
		
		int count = 0;
		for (i = 0; i < 10; i++) {
			if (ar1[i] == num) {
				System.out.println("Value found in the index : " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Sorry nope");
		}

	}

}
