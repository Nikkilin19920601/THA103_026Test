package xxx;

import java.util.Arrays;

public class HomeWork4Highestgrade {

//	班上有8位同學,他們進行了6次考試結果如下:
//  請算出每位同學考最高分的次數
//	(提示:二維陣列) 

	public static void main(String[] args) {

		// 先定義陣列值，因為數值很多採取以下方式
		int[][] grade = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 35, 77, 75, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 80, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		//將結果視為一維陣列
		int[] result = new int[8];

		// 抓取二維陣列每一排最高值，使用雙層FOR迴圈
		// 想像每一排有一個暫存值，假設下一個數字高於暫存，則暫存值=該陣列值
		// 宣告一變數為index，代表每次被計算到的該陣列索引順序
		for (int i = 0; i < grade.length; i++) {
			int temp = 0, index = 0;
			for (int j = 0; j < grade[i].length; j++) {
				if (grade[i][j] > temp) {
					temp = grade[i][j];
					index = j;
				}
			}
			// 抓出來後做計算(將同學視為索引值)
			result[index]++;

		}
		//Arrays.toString();是一個方便的方法，用於將陣列轉換為字串表示形式
		System.out.println(Arrays.toString(result));
	}
}