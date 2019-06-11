package objectcode;

public class pokemon {

    private String name;
	private String type;
	private int hp;
	//constructor
	public pokemon(String n, String t,int h )
	{
		this.name=n;
		this.type=t;
		this.hp=h;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
