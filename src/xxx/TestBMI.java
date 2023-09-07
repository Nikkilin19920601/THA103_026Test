package xxx;

public class TestBMI {

	public static void main(String[] args) {
	    double weight = 50.0 , height = 1.7; // bmi = 50/1.7*1.7也可但不好沿用
		double bmi= weight/(height*height) ;// Math.pow(height,2)
		System.out.println("BMI =" + bmi);
		System.out.printf("BMI = %.1f",bmi);
		
		
	    if(bmi<18.5) {
	    	System.out.println("過瘦");
		}
	    else if(18.5<=bmi && bmi<24) { //else if(bmi<24) ，因為第一個條件不成立代表BMI>=18.5
	    	System.out.println("正常"); 
	    }
	    else if(bmi>=24) {             //可以不用else if(XXX)，縮小為else即可
	    	System.out.println("過胖"); 
		}
	 }	
}

//除此之外更簡單的寫法:過胖先；正常次之
//也可以用三元運算子
//public class TestBMI {
//
//public static void main(String[] args) {
//  double weight = 50.0;
//  double height = 1.7;
//  double bmi = weight / Math.pow(height, 2);
//
//  String result =(bmi < 18.5) ? "過瘦" : (bmi>= 24) ? "過胖" : "正常";
//  System.out.println(result);
//	System.out.printf("BMI = %.1f",bmi);
//}
//}
