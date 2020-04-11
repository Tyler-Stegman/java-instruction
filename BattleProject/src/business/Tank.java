package business;

public class Tank {

	private int id;
	private String side;
	private String type;
	private String model;
	private double hp;
	private double armor;

	public Tank() {
		super();
	}

	public Tank(int id, String side, String type, String model, double hp, double armor) {
		super();
		this.id = id;
		this.side = side;
		this.type = type;
		this.model = model;
		this.hp = hp;
		this.armor = armor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Tank [id=" + id + ", side=" + side + ", type=" + type + ", model=" + model + ", hp=" + hp + ", armor="
				+ armor + "]";
	}

}
