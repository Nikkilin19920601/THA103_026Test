package xxx;

public class Elephant extends Animal {
	String name;

	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

	public void speak() {
		super.speak();
		System.out.println("名子是=" + name);
	}

}
