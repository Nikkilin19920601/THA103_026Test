package xxx;

import java.io.Serializable;

public class Dog2 implements Serializable{
	private String name;
	
	public Dog2(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
