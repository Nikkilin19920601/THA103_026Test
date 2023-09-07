package xxx;

import java.io.*;

public class Copyfile {

	// • 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

	public static void copyfile(String f1, String f2) {
		try {
			File inputFile = new File(f1);
			File outputFile = new File(f2);
			FileInputStream in = new FileInputStream(inputFile);
			FileOutputStream out = new FileOutputStream(outputFile);

			int length = 0;
			byte[] b = new byte[4096];
			while ((length = in.read(b)) != -1) {
				// b: 代表要輸出的byte陣列 (資料都放在裡面了)
				// 0: 代表從這個陣列的第一個元素開始輸出 (索引值)
				// length: 代表要輸出的資料量
				out.write(b, 0, length);
				out.flush();
			}

			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("資料傳輸失敗");
		}
	}

	public static void main(String[] args) throws IOException {
		String f1 = "C://THA103_Workspace/Sample.txt";
		String f2 = "C://THA103_Workspace/Data.txt";

		copyfile(f1, f2);
	}
}

