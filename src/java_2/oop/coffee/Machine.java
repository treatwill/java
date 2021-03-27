package java_2.oop.coffee;

public abstract class Machine {
	protected String type;
	protected String brand;
	protected boolean on;

	protected Machine(String type, String brand, boolean on) {
		this.type = type;
		this.brand = brand;
		this.on = on;
	}

	public Machine() {

	}


	public abstract void powerOn();
	public abstract void powerOff();
}
