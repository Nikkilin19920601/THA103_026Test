package xxx;
import java.util.*;

public class HomeWork10Random {
    // 判斷是否為質數的方法
   
    

   

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size() != 5) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            set.add(randomNumber);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (isPrime(num)) {
                System.out.println(num+"是質數");
            } else {
                System.out.println(num+"不是質數");
            }
        }
    
        
}
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3 || number == 5 || number == 7 ) {
            return true;
        }
        if ((number % 2 == 0) || (number % 3 == 0)|| (number % 5 == 0)||(number % 7 == 0)) {
            return false;
        }
		return true;
      
}
}

