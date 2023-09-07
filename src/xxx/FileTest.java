package xxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

	public static void main(String[] args) {
		File f1 = new File("C://THA103_Workspace//Sample.txt"); // 目錄物件

		try {

			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			
			int byteCount = (int)f1.length();
			int charcount = 0;
			int linecount = 0;
			String line;
			while ((line = br.readLine()) != null) {
				charcount += line.length();
				linecount++;
			}
			
			br.close();
			fr.close();
			System.out.println("Sample.txt檔案共有" + byteCount + "個位元組," + charcount + "個字元," + linecount + "列資料");
			//Sample.txt檔案共有1387個位元組,524個字元,11列資料
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	
	
	  
