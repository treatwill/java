package java_2.oop.coffee;

public class Cup {

	double capacity;
	String cupType;
	String fluidContents;
	String fill;
/*
	Properties :
		-capacity (oz)
		-type (glass,mug,tumbler,styrofoam, etc.)
		-fluidContents (coffee,tea,lemonade,etc.)
		-fill (how much is the cup filled?  max == cup capacity)

	Methods :
		-drink(oz) - lowers the fill of the cup by how much is 'drunk'. Display a message indicating the type of coffee being consumed.
 */

	public Cup(double capacity, String cupType, String fluidContents, String fill) {
		this.capacity = capacity;
		this.cupType = cupType;
		this.fluidContents = fluidContents;
		this.fill = fill;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getCupType() {
		return cupType;
	}

	public void setCupType(String cupType) {
		this.cupType = cupType;
	}

	public String getFluidContents() {
		return fluidContents;
	}

	public void setFluidContents(String fluidContents) {
		this.fluidContents = fluidContents;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}

	public void drink() {

	};

	@Override
	public String toString() {
		return "Cup{" +
				"capacity=" + capacity +
				", cupType='" + cupType + '\'' +
				", fluidContents='" + fluidContents + '\'' +
				", fill='" + fill + '\'' +
				'}';
	}
}
