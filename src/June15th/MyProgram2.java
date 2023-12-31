package June15th;

import java.util.Scanner;

public class MyProgram2 {

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("A password must have at least 8 characters.");

		String pass = kb.next();
		boolean result = is_validPass(pass);
		if(result) {
			System.out.println("Yes you got it");
		}else {
			System.out.println("Nope");
		}

	}

	public static boolean is_validPass(String password) {
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}
		int charCount = 0, numCount = 0;
		
		for(int i = 0; i < password.length(); i++) {
			char mych = password.charAt(i);
			
			if(is_Num(mych)) {
				numCount++;
			}else if(is_letter(mych)) {
				charCount++;
			}else {
				return false;
			}
		}
		
		return(charCount >= 2 && numCount >= 2 );
	}

	public static boolean is_letter(char ch) {
		ch = Character.toUpperCase(ch);
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean is_Num(char ch) {
		if(ch >= '0' && ch <= '9') {
			return true;
		}else {
			return false;
		}
	}

}
