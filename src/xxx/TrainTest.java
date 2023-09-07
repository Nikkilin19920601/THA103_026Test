package xxx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TrainTest {
	
	//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
	
	//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	//- (118, “自強”, “高雄”, “台北”, 500)
	//- (1288, “區間”, “新竹”, “基隆”, 400)
	//- (122, “自強”, “台中”, “花蓮”, 600)
	//- (1222, “區間”, “樹林”, 七堵, 300)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	//• 請寫一隻程式,能印出不重複的Train物件
	//
	//• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
	//
	//• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
	//
	//• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
	
	public static void main(String[] args) {
		Set<Train> set = new TreeSet();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		Iterator<Train> i1 = set.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		System.out.println("======================================================");
		
		for(int i = 0;i < set.size();i++) {
			Train train = (Train) set.toArray()[i];
			System.out.println(set);
		}
		System.out.println("======================================================");
		
		for (Train aTrain : set) {
			System.out.println(aTrain);
		}
	}

}