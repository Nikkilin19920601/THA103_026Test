package xxx;

import java.io.*;

public class WriteandInput {

//	import java.io.*;
//
//	public class FileWriterExample {
//	    public static void writeFile(String filePath, String content) {
//	        try {
//	            File file = new File(filePath);
//	            FileWriter fileWriter = new FileWriter(file, true); // 使用 true 參數開啟檔案以附加模式寫入
//	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//	            bufferedWriter.write(content);
//	            bufferedWriter.newLine(); // 加入換行符號，讓每次寫入的內容佔一行
//
//	            bufferedWriter.close();
//	            System.out.println("文字已成功寫入檔案");
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	            System.out.println("文字寫入失敗");
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        String filePath = "C:\\THA103_Workspace\\data.txt";
//	        String content = "這是一行文字，用於測試寫入檔案。";
//
//	        writeFile(filePath, content);
//	    }
//	}



	
	    public static void copyFile(String srcFile, String destFile) {
	        try {
	            File inputFile = new File(srcFile);
	            File outputFile = new File(destFile);
	            FileInputStream fis = new FileInputStream(inputFile);
	            FileOutputStream fos = new FileOutputStream(outputFile);
	            BufferedInputStream bis = new BufferedInputStream(fis);
	            BufferedOutputStream bos = new BufferedOutputStream(fos);

	            int length;
	            byte[] buffer = new byte[4096];
	            while ((length = bis.read(buffer)) != -1) {
	                bos.write(buffer, 0, length);
	            }

	            bis.close();
	            bos.close();
	            System.out.println("檔案複製成功");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("檔案複製失敗");
	        }
	    }

	    public static void main(String[] args) {
	        String srcFile = "C:\\THA103_Workspace\\Sample.txt";
	        String destFile = "C:\\THA103_Workspace\\Data.txt";

	        copyFile(srcFile, destFile);
	    }
	}


