package xxx;

import java.util.Scanner;

public class HomeWork5Square {
	/*
	 * 請設計一個方法為starSquare(int width, int height), 當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
	 */

	public static void main(String[] args) {

		System.out.println("請輸入長XXX,寬XXX");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);

	}

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
