package xxx;

public class TestNineNine {

	public static void main(String[] args) {
	    
//(1) 九九乘法表(FOR迴圈): 全部宣告在裡面，結果最後在最裡面的區塊執行
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + "*" + b + "=" + (a * b));
			}
		}
	}
}

//(2) 九九乘法表(While迴圈): 先宣告初始值再區塊外，條件在迴圈外，結果在最裡面執行，計次在結果後執行
	    
       int a = 1;
       while(a <= 9) {
    	   int b = 1;
    	   while (b <= 9) {
    		   
    		   System.out.println(a + "*" + b + "=" + (a * b));
    		   
    		   b++;
    	       }
    	   a++;
    	   }
      }
}  

//(3) 九九乘法表(Do While迴圈): 先宣告初始值再區塊外，先有個do告訴系統做什麼條件在迴圈外，結果在最裡面執行，計次在結果後執行，最後While才是條件
     
          int a = 1;
            do {

	         int b = 1;
	           do {
		         System.out.println(a + "*" + b + "=" + (a * b));
		         b++;
	          }while (b <= 9);
	       a++;			
           } while (a <= 9);
      }
}
  
//(4) 九九乘法表(FOR迴圈+While迴圈):
            for( int a = 1; a <= 9; a = a + 1) {
	          int b = 1;
 	          while(b <= 9) {
		         System.out.println(a + "*" + b + "=" + (a * b));
		      b++;
	          }
           }
      }
}

//(5) 九九乘法表(FOR迴圈+While迴圈):
             for (int a = 1; a <= 9; a = a + 1) {
	           int b = 1;
	           do {
		       System.out.println(a + "*" + b + "=" + (a * b));
		       b++;
	           } while (b <= 9);
            }
      }
}

//(6) 九九乘法表(While迴圈+DoWhile迴圈):

             int a = 1;
             while (a <= 9) {
	              int b = 1;
	              do {
		              System.out.println(a + " × " + b + " = " + (a * b));
		              b++;
	              } while (b <= 9);
	         a++;
         }
     }
}