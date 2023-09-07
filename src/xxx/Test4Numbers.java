package xxx;

public class Test4Numbers {

//輸出0~100裡4的倍數

	public static void main(String[] args) {
		for (int count = 4; count <= 100; count += 4) {
			System.out.println(count);
		}

		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}

	}
}
