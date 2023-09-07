package xxx;

public class HomeWork5genAuthCode {

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:

	public static void genAuthCode(String str) {

		for (int i = 1; i <= 8; i++) {
			int b = (int) (Math.random() * str.length());
			char x = str.charAt(b);
			System.out.print(x);
		}
	}

	public static void main(String[] args) {

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		genAuthCode(str);


	}
}
