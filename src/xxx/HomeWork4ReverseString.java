package xxx;

public class HomeWork4ReverseString {

	/*
	 * 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
	 * (提示:String方法,陣列)
	 */

	public static void main(String[] args) {
		String hw = "Hello World";
		for (int i = hw.length() - 1; i >= 0; i--) {
			char a = hw.charAt(i);
			System.out.print(a);

		}

	}

}
