package xxx;

public class Animal {
	int age;
	float weight;

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	public void speak() {
		System.out.println("年齡是=" + age);
		System.out.println("體重是=" + weight);
	}

}
