package xxx;

public class HomeWork5Overloading {
/*利用Overloading,
 * 設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
 * 可以找出二維陣列的最大值並回傳,如圖:*/
	
	//步驟二：寫下maxElement方法，其中將變數宣告於方法中(為整數陣列)
	//因為不能直接執行抓最大值的函數，要用抓INDEX陣列的方式去一個個比較陣列中的大小
	//當雙層迴圈執行完，最大值的陣列"索引值"就是imax
	public static int maxElement(int[][] intarrays) {
		int imax = intarrays[0][0];
		for (int i = 0; i < intarrays.length; i++) {
 			for (int j = 0; j < intarrays[i].length; j++) {
				if (intarrays[i][j] > imax) {
					imax = intarrays[i][j];
					
				}
			}
 			
		}	
		return imax;
	
	}
	
	//步驟二：寫下maxElement方法，其中將變數宣告於方法中(為浮點數陣列)
	//因為不能直接執行抓最大值的函數，要用抓INDEX陣列的方式去一個個比較陣列中的大小
	//當雙層迴圈執行完，最大值的陣列"索引值"就是dmax
	
	public static double maxElement(double[][] doublearrays) {
		double dmax = doublearrays[0][0];
		for (int i = 0; i < doublearrays.length; i++) {
 			for (int j = 0; j < doublearrays[i].length; j++) {
				if (doublearrays[i][j] > dmax) {
					dmax = doublearrays[i][j];
					
				}
 			}
		}
		return dmax;
	}
	
	
	//步驟一:思考---先設定陣列值，藉由main找到入口執行
	public static void main(String[] args) { 
		int[][] intarrays = {{1,6,3},{9,5,2}};
		double[][] doublearrays = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		
		//步驟三:因為步驟二回傳的方法是陣列值，要將其改回整數跟浮點數，故呼叫方法
		//帶入intarrays跟double的值	，做值的呼叫改寫
		int x = maxElement(intarrays);
		double y = maxElement(doublearrays);
		
		//步驟四:可以將基本變數打印出來
		System.out.println(x);//x也可以直接maxElement(intarrays)
		System.out.println(y);//y也可以直接maxElement(doublearrays)
	}
}
