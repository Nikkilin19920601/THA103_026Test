package xxx;

import java.util.Scanner;

public class RegexTest {

	
		
		public static void main(String[] args) {
			
			System.out.print("輸入身分證");
			Scanner sc = new Scanner(System.in);
			String ID = sc.next();
			String regex = "^[A-Z][1-2]\\d{8}$";
			
			if (ID.matches(regex)) {
				System.out.print("OK");
			} else {
				System.out.print("False");
			}
		}
	}





