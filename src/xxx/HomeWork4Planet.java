package xxx;

public class HomeWork4Planet {

//	有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	
	//先宣告陣列值
	public static void main(String[] args) {
	String [] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
	
	//開始進行比對(For迴圈一層層比對母音)，把陣列宣告成字元變數以便比對
	int count = 0;
		for(int i = 0 ;i < planet.length;i++) {
			String str = planet[i];
			for (int n = 0; n < str.length(); n++) {
				char vowel = str.charAt(n);
				if ( vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'|| vowel == 'u') {
					count++;
				}
			}
			
			
		}
	//將結果打印出來
	System.out.print("總共有" + count + "個母音");
			
		}
	}
