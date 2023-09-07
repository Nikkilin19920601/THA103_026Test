package xxx;

import java.util.Scanner;

public class HomeWork5rangAvg {

	/*
	 * 請設計一個方法為randAvg(), 從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	 */

	public static void main(String[] args) {
		int[] x = new int[10];
		for (int i = 0; i < 10; i++) {
			x[i]=(int) (Math.random() * 101);
			randAvg(x);
		}
		
	}

	public static void randAvg(int[] x) {

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			System.out.println(x[i]);
		}
		// 平均
		int avg = (int) sum / (x.length);
		System.out.println("陣列平均值=" + avg);
	}

}
