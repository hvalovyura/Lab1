package bsu.rfe.java.group8.lab1.Hvalov.varC7;

public abstract class Food implements Consumable {

	String name = null;
	
	public Food(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Food)) return false;
		if(name == null || ((Food)obj).name == null) return false;
		return name.equals(((Food)obj).name);
	}

	public String toString() {
		return name;
	}
	
}
