package xxx;


public class CountRunable implements Runnable {
	
	private String name;

    public CountRunable(String name) {
        this.name = name;
    }

	
	public static void main(String arg[]) {
		System.out.println("大胃王比賽開始");
		CountRunable r1 = new CountRunable("詹姆士");// 產生Runnable物件
		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
		CountRunable r2 = new CountRunable("饅頭人");
		Thread t2 = new Thread(r2);
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("大胃王比賽結束");
	}

	public CountRunable() {
	}

	@Override
	public void run() {
		int counter = 1;
		// TODO Auto-generated method stub
		while (counter < 11) {
			System.out.println(name+"吃第" + counter + "碗飯");
			counter++;

			try {
				int i = (int) (Math.random() * 3000);
				if (i < 500) {
					i = i + 500;
				}
				Thread.sleep(i);
			} catch (Exception e) {
			}
		}
		
		System.out.println(name+"吃完了");
	}
}


