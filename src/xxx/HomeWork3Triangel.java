package xxx;

import java.util.Scanner;

public class HomeWork3Triangel {

/*題目一
 * 請設計一隻程式,使用者輸入三個數字後
 * 輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
 * (提示:Scanner,三角形成立條件,判斷式if else)
 * (進階功能:加入直角三角形的判斷)*/

	
// 步驟一.先製作一個可以亂數填入數字的程式
	public static void main(String[] args) {
	System.out.println("請輸入3個整數");
	Scanner sc = new Scanner(System.in);
	int arrays[] = new int[3];
	for (int i = 0; i < arrays.length;i++) {
		arrays[i] = sc.nextInt();
	}
	
// 步驟二.判斷三角形的公式
/* 若a + b  ≦  c三線段無法構成三角形 
 * 若a = b
 * 若a × a + b × b  <  c × c ，三線段構成鈍角三角形
 * 若a × a + b × b  =  c × c ，三線段構成直角三角形
 * 若a × a + b × b  >  c × c ，三線段構成銳角三角形
 */
	int a = arrays[0];
	int b = arrays[1] ;
	int c = arrays[2];
	int dataA = a*a;
	int dataB = b*b;
	int dataC = c*c;
    if(a+b<=c || a+c <=b || b+c <= a) {
		System.out.println("不是三角形");
	}else if(a==b && b==c) {
		System.out.println("正三角形");
	}else if(a==b || b==c || c==a) {
		System.out.println("等腰三角形");
	}else if(dataA+dataB<dataC) {
		System.out.println("鈍角三角形");
	}else if(dataA+dataB==dataC) {
		System.out.println("直角三角形");	
	}else if(dataA+dataB>dataC) {
		System.out.println("銳角三角形");
	}
	}
}
