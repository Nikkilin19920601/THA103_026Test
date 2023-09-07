package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {
		Set set = new HashSet();
		while (set.size() != 6) {
            int randomNumber = (int)(Math.random()*49) + 1;
            set.add(randomNumber);
        }
		
		// Set家族只能用Iterator 取值
		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

	}

}

