package xxx;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		
		while(true){
		try {
			
			Calculator result = new Calculator();
			System.out.println("請輸入x和y的值：");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			result.setter(a, b);
			System.out.println("x的y次方結果為：" + result.powerXY());
		
		} catch (CalException e) {
			
			System.out.println("發生例外：" + e.getMessage());
		}
		

		}
	}

}
