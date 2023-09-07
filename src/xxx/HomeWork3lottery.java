package xxx;

import java.util.Scanner;

public class HomeWork3lottery {

	/*
	 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
	 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9), 畫面會顯示他可以選擇的號碼與總數 (提示:Scanner)
	 * (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	 */

	public static void main(String[] args) {
		System.out.println("填入不喜歡的數字");

//先設計Scanner可以填入數字
		Scanner sc = new Scanner(System.in);
		int unwantednum = sc.nextInt();

//要排除阿文選擇數字的10的倍數跟個位數
		int wantarrays[] = new int[50];
		int count = 0;
		for (int b = 1; b <= 49; b++) {
			if (b % 10 != unwantednum && b / 10 != unwantednum) {
				System.out.println("阿文能選擇的數字:" + b);
				wantarrays[b] = b;
				count++;
			}
		}
		System.out.println("阿文可以選擇總共幾個數字:" + count);

// 亂數印出選擇出的6個數字且不得重複
		System.out.println("阿文選擇的號碼:");
		for (int i = 0; i < 6; i++) {
			int randomIndex = (int) (Math.random() * count);
			while (wantarrays[randomIndex] == 0) {
				randomIndex = (int) (Math.random() * count);
			}
			System.out.println(randomIndex);
			wantarrays[randomIndex] = 0;
		}
	}

}
