package bsu.rfe.java.group8.lab1.Hvalov.varC7;

public class Apple extends Food {

	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Apple(String size) {
		super("Яблоко");
		this.size = size;
	}

	public void consume() {
		System.out.println(this + " съедено");
	}

	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}

	public boolean equals(Object obj) {
		if(super.equals(obj))
		{
			if(!(obj instanceof Apple)) return false;
			return size.equals(((Apple)obj).size);
		} else return false;
	}

}
