package xxx;

//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過3000元,
//	就會停止匯款給熊大;但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊大要提款的金額,
//	熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
//	假設媽媽一次匯款 2000 元,熊大一次提款1000元,寫一個Java程式模擬匯款10次與提款10次的情形。
//
//	• 參考範例:TestWaitNotify.java
class Account {
	private int balance = 0;

	synchronized public void deposit(int amount) {
		while (balance > 3000) {
			System.out.println("熊大帳戶餘額超過3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("匯款：" + amount + "；餘額：" + balance);
		notify();
	}

	synchronized public void withdrawal(int amount) {
		while (balance < amount) {
			System.out.println("餘額不足，停止提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("提款：" + amount + "；餘額：" + balance);
		if (balance < 1000) {
			System.out.println("餘額不足，增加存款");
			notify();
		}
	}
}

class Deposit extends Thread {
	Account account;

	public Deposit(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.deposit(2000);
	}
}

class Withdrawal extends Thread {
	Account account;

	public Withdrawal(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.withdrawal(1000);
	}
}

public class HomeWork9 {
	public static void main(String[] args) {
		Account account = new Account();
		Withdrawal withdrawal = new Withdrawal(account);
		Deposit deposit = new Deposit(account);
		withdrawal.start();
		deposit.start();
	}
}
