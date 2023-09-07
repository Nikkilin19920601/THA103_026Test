package xxx;

public class HomeWork1 {

	
//第一題:請設計一隻Java程式,計算12,6這兩個數值的和與積
	public static void main(String[] args) {
        int sum = 6 * 12;
        System.out.println(sum);
    }
}


//第二題: 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
    public static void main(String[] args) {
        int num1 = 200 / 12;
        int num2 = 200 % 12;
        
        System.out.println(num1 + "盒" + num2 + "顆");
    }
}

//第三題:請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    public static void main(String[] args) {
    	int totalseconds = 256559;
        int num1 = totalseconds / (24 * 60 * 60);
        int num2 = (totalseconds % (24 * 60 * 60)) / (60 * 60);
        int num3 = ((totalseconds % (24 * 60 * 60)) % (60 * 60)) / 60;
        int num4 = ((totalseconds % (24 * 60 * 60)) % (60 * 60)) % 60;

        System.out.println(num1 + "天:" + num2 + "時:" + num3 + "分:" + num4 + "秒");
    }
}

//第四題:請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
    public static void main(String[] args) {
        double PI = 3.1415;
        double radius = 5;
        double circumfe = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.printf("圓面積=" + area + ", 圓周長=" + circumfe);
    }
}

//第五題:某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢(期末本利和＝期初本金×（1＋利率）期數次方)
    public static void main(String[] args) {
        int money = 1500000;
        int year = 10;
        double interestrate = 2.0/100.0;
        double totalamount = money * Math.pow (1 + interestrate, year);
        System.out.printf("本利和=%.2f" , totalamount);
    }
}

//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        char num3 = '5';
        String num4 = "5";

        System.out.println(num1 + num2); //5 + 5:代表將兩個整數相加，結果是 10。
        System.out.println(num1 + num3); //5 + ‘5’:字符 '5' 會被視為其對應的 ASCII 數值。因此，這個運算式相當於 5 + 53，結果是 58。
        System.out.println(num1 + num4); //5 + “5”：在這個運算式中，使用了字串串接的概念。num1 是整數 5，而 num4 是字串 "5"。
                                         //當整數與字串進行串接時，會將整數轉換為字串，然後進行串接操作。因此，這個運算式相當於 "5" + "5"，結果是 "55"
    }
}




