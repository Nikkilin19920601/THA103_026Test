package xxx;

import java.io.*;

public class Objectsr implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注意物件寫入需注意的事項,
	//	若C:\內沒有data資料夾,請用程式新增這個資料夾
	//	• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//寫入
		File file = new File("C:\\data\\Object.ser");
		FileOutputStream f1 = new FileOutputStream(file);
		BufferedOutputStream fb= new BufferedOutputStream(f1);
		ObjectOutputStream f2 = new ObjectOutputStream(fb);
		Object cat1 = new Cat("Mary");
		Object cat2 = new Cat("Ada");
		Object dog1 = new Dog2("James");
		Object dog2 = new Dog2("Tom");
		System.out.println("有兩個Cat物件:"+cat1+","+cat2);
		System.out.println("有兩個Dog物件:"+dog1+","+dog2);
		
		if (!file.exists()) {
			file.mkdir();
		}
		
		f2.writeObject(cat1);
        f2.writeObject(cat2);
        f2.writeObject(dog1);
        f2.writeObject(dog2);
        
        f2.close();
        f1.close();
        System.out.println("檔案成功寫入");
		
        
        //讀取
        File file2 = new File("C:\\data\\Object.ser");
        FileInputStream f3 = new FileInputStream(file);
        BufferedInputStream fs= new BufferedInputStream(f3);
        ObjectInputStream f4 = new ObjectInputStream(fs);
        
        Cat cat11 = (Cat) f4.readObject();
        Cat cat22 = (Cat) f4.readObject();
        Dog2 dog11 = (Dog2) f4.readObject();
        Dog2 dog22 = (Dog2) f4.readObject();
        
        f4.close();
        f3.close();
        
        ((Cat) cat11).speak();
        ((Cat) cat22).speak();
        ((Dog2) dog11).speak();
        ((Dog2) dog22).speak();
	}
}
