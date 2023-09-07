package xxx;



public class WeightTest {

	
	public static void main(String[] args) {
		Weightable[] e = new Weightable[3]; 
		e[0] = new Dog();
		e[1] = new Plane();
		e[2] = new Powder();
		
		for (int i = 0; i < e.length; i++) {
			e[i].getWeightTool();
		}
	}
}



