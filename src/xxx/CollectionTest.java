package xxx;

import java.math.BigInteger;
import java.util.*;

public class CollectionTest {
	private static final Object Object = null;

//	• 請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(Object);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		
		Iterator i1 = list.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("==========");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);

		}
		System.out.println("==========");
		for (Object a : list) {
			System.out.println(a);
		}
		System.out.println("==========");
		
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		
		Iterator<Object> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Object obj = iterator2.next();
			if (!(obj instanceof Number)) {
				iterator2.remove();
			}

		}
		System.out.println("去除非Number");
		for (Object obj1 : list) {
			System.out.println(obj1);

		}

	}
}

