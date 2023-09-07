package xxx;

public class MyRectangle {

//	• 請另外建立一個MyRectangleMain類別,此類別只有main方法
////	(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
////	(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
	
	public static void main(String[] args) {
		HomeWork5Rectangle a = new HomeWork5Rectangle(10,20);
		System.out.println("矩形面積=" + a.getArea());
	
		HomeWork5Rectangle x = new HomeWork5Rectangle();
		x.setWidth(10);
		x.setDepth(20);
		System.out.println("矩形面積=" + x.getArea());
		
	}
}


