package xxx;

import java.io.*;

public class Data {

	// • 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) {

		try {
			File data = new File("C:\\THA103_Workspace\\Data.txt");
				FileOutputStream fos = new FileOutputStream(data, true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos);

				int[] RandomArray = new int[10];
				for (int i = 0; i < RandomArray.length; i++) {
					RandomArray[i] = (int) (Math.random() * 1000);
					ps.println("亂數為:" + RandomArray[i]);
					
				}
			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
