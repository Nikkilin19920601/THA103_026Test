package xxx;

import java.util.Scanner;

public class HomeWork3Random {
	/*
	 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息, 猜對則顯示正確訊息,如圖示結果:
	 */

	public static void main(String[] args) {
		System.out.println("開始猜數字");

//先設計Scanner可以填入數字
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

//嘗試加入亂數數字
		int i;
		i = (int) (Math.random() * 100);

		// PS.我直接將進階功能做進去:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//設計無窮迴圈

		while (true) {
			// 猜測的結果
			if (a != i) {
				System.out.println("猜錯了");
			}
			if (a < i) {
				System.out.println("小於正確答案");
			} else if (a > i) {
				System.out.println("大於正確答案");
			} else {
				System.out.println("猜對了");
				break;
			}
			a = sc.nextInt();
		}

	}
}