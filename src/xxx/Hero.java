package xxx;

import xxx.HeroSameFunction.attackable;
import xxx.HeroSameFunction.defendable;
import xxx.HeroSameFunction.moveable;

public abstract class Hero implements attackable, moveable, defendable {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	

}
