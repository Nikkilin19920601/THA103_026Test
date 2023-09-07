package xxx;

public class HomeWork2 {
	
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 2; a <= 1000 ; a = a + 2 ) {
		sum += a;

	    } 
		System.out.println("1到1000偶數和"+sum);
	}
}

//  • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

    public static void main(String[] args) {
        int a = 1;
	    for (int b = 1; b <= 10; b++) {
		a *= b;
	    }
	    System.out.println("1到10連乘機"+a);
    }
}


//  • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

    public static void main(String[] args) {

	    int a = 1;
	    int b = 1;
	    while (b <= 10) {
	    a *= b;
	    b++;
	    }
	    System.out.println("1到10連乘機"+a);
    }
}


//   • 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100

    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
		int sum = a * a;
		System.out.println(sum);
	    }
    }
}


//   • 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//   輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
 
	public static void main(String[] args) {
	  int count = 0;
		for (int num = 1; num <= 49; num++) {
          if (num % 10 != 4 && num / 10 != 4) {
              System.out.println("阿文能選擇的數字:"+num+" ");
             count++;
		  }
	    }
		System.out.println("阿文可以選擇總共幾個數字:"+ count);
    }
}

//   • 請設計一隻Java程式,輸出結果為以下:
//   1 2 3 4 5 6 7 8 9 10
//   1 2 3 4 5 6 7 8 9
//   1 2 3 4 5 6 7 8
//   1 2 3 4 5 6 7
//   1 2 3 4 5 6
//   1 2 3 4 5
//   1 2 3 4
//   1 2 3
//   1 2
//   1

    public static void main(String[] args) {
	    for (int i = 1; i <= 10; i++) { 
		    for (int j = 1; j <= (11 - i); j++) { 

			// 第一次 i=1;j=1
			// 第二次(跳過) i=1;j=2
			// 第三次 i=1;j=3
			// 第四次 i=1;j=4
			// ......依此類推

			    System.out.print(j+" ");
		    }

		 System.out.println();
	    }
    }

}



//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
    public static void main(String[] args) {
	    for (char x = 'A'; x <= 'F'; x++) {  // X=每一排呈現值
		    for (char y = 1; y <= (x-'A'+1); y++) { 
		    	//開始迴圈，表示每一次要跑幾個字母
		    	//以上一排以一個字母開始，後續呈現2次、3次......次運算
		    	//計算字母 c 距離字母 'A' 的距離（即在字母表中的索引位置），並加上 1
			System.out.print(x); 
   		    }

		 System.out.println();
	     }
    }
}