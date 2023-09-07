package xxx;

import java.util.Scanner;

public class HomeWork4yymmdd {

private static final String Bolean = null;

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

//	(提示1:Scanner,陣列)
	public static void main(String[] args) {
		System.out.println("請輸入yyyy,mm,dd");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

//	(提示2:需將閏年條件加入)	
		boolean leapyear = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
		    leapyear = true;
		}
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)	
			int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if (leapyear) {
				daysInMonth[1] += 1; // 將二月的天數增加 1
			}

//	計算日期
			int dayOfYear = day;
			for (int i = 1; i < month; i++) {
				dayOfYear += daysInMonth[i - 1];
			}

			if (month == 1 && day <= 31) {
			    dayOfYear = day;
			}

			System.out.println("輸入的日期為該年第" + dayOfYear + "天");
		}

}

