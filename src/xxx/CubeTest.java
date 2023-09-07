package xxx;

public class CubeTest {

	public static void main(String[] args) throws CubeException {

		try {
			Cube a = new Cube();
			a.setter(0);
			if (a.getter() <= 0) {
				throw new CubeException("正立方體邊常不得為0或是負數");
			}
			System.out.println(a.volume());

		} catch (CubeException e) {
			System.out.println(e.getMessage());
		}

	}
}
