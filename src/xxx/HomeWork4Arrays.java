package xxx;

public class HomeWork4Arrays {

	/*
	 * 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 (提示:陣列,length屬性)
	 */

	public static void main(String[] args) {

		// 先定義陣列

		int arrays[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 計算總和與平均
		// 總和
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		// 平均
		double avg = (double) sum / (arrays.length);
		System.out.println("陣列平均值="+avg);

		// 使用for迴圈計算，如果該陣列值>平均，則印出來
		System.out.println("大於平均值的陣列數字=");
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] > avg)
				System.out.println(arrays[i]);
		}
	}
}
