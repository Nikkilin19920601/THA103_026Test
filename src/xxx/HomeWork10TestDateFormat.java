package xxx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)
//年/月/日(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)

public class HomeWork10TestDateFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入數字: ");

		if (sc.hasNextInt()) {
			int dateInt = sc.nextInt();
			String dateString = String.valueOf(dateInt);
			String regex = "^\\d{8}$";
			if (dateString.matches(regex)) {
				System.out.println("格式正確");
			} else {
				System.out.println("數字格式不正確請再輸入一次");
				return;
			}

			SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat outputFormat = null;

			System.out.println("請選擇顯示格式:");
			System.out.println("(1) 年/月/日");
			System.out.println("(2) 月/日/年");
			System.out.println("(3) 日/月/年");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				outputFormat = new SimpleDateFormat("yyyy/MM/dd");
				break;
			case 2:
				outputFormat = new SimpleDateFormat("MM/dd/yyyy");
				break;
			case 3:
				outputFormat = new SimpleDateFormat("dd/MM/yyyy");
				break;
			default:
				System.out.println("選項錯誤");
				return;
			}

			try {
				Date date = inputFormat.parse(dateString);
				String formattedDate = outputFormat.format(date);
				System.out.println(formattedDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("數字格式不正確請再輸入一次");
		}
	}
}
