package xxx;

public class TESTangel {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				// 第一次 i=1;j=1
				// 第二次(跳過) i=1;j=2(X)
				// 第三次 i=2;j=2
				// 第四次 i=2;j=3(X)
				// 依此類推......

				System.out.print("*");
			}

			System.out.println();
		}
	}

}