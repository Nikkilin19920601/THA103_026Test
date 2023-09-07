package xxx;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork10TestFormat {
//	• 請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號,而輸入非任意數會顯示提示訊息如圖 (提示: TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)
//	• 補充 (依此類推):
//	輸入12345,千分位為12,345,輸入123,千分位為123
//	輸入0.75,百分比為75%,輸入1,結果為100%

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入數字: ");

		if (sc.hasNextDouble()) {
			double num = sc.nextDouble();
			String numString = String.valueOf(num);
			String regex = "^(\\d+)\\.(\\d+)";
			if (numString.matches(regex)) {
				System.out.println("格式正確");
			} else {
				System.out.println("數字格式不正確請再輸入一次");
			}

			System.out.println("請選擇顯示格式:");
			System.out.println("(1) 千分位");
			System.out.println("(2) 百分比");
			System.out.println("(3) 科學記號");

			int choice = sc.nextInt();
			String formattedNumber = "";

			switch (choice) {
			case 1:
				DecimalFormat format1 = new DecimalFormat("###,###.00");
				formattedNumber = format1.format(num);
				break;
			case 2:
				DecimalFormat format2 = new DecimalFormat("#####.00%");
				formattedNumber = format2.format(num);
				break;
			case 3:
				DecimalFormat format3 = new DecimalFormat("0.##E0");
				formattedNumber = format3.format(num);
				break;

			default:
				System.out.println("選項錯誤");
				return;

			}

			System.out.println(formattedNumber);
		} else {
			System.out.println("數字格式不正確請再輸入一次");
		}
	}
}
