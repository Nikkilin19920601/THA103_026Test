package xxx;

import java.util.Scanner;

public class HomeWork4Money {

//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)

	// 步驟一.先製作一個可以填入數字的程式
	public static void main(String[] args) {
		System.out.println("請輸入金額");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		// 步驟二.將資料帶入陣列
		int [][]colleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		// 步驟三.進入判斷:當INDEX=[1][x]>money，就代表有錢可以借，而[x]值剛好跟員編同一直欄，所以打印出來
		System.out.println("有錢可借的員工編號:");
		for (int i = 0; i < colleague[0].length; i++) {
			if (colleague[1][i] >= money) {
				System.out.println(colleague[0][i]);
			}

		}
	}
}
