package xxx;
public class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attackmethod() {
		// TODO Auto-generated method stub
		System.out.println("放弓箭");
	}

	@Override
	public void movemethod() {
		// TODO Auto-generated method stub
		System.out.println("跑步");
	}

	@Override
	public void defendmethod() {
		// TODO Auto-generated method stub
		System.out.println("做防禦動作");
	}
}
