package bsu.rfe.java.group8.lab1.Hvalov.varC7;

public class Cheese extends Food {

	Double calories;
	
	public Cheese() {
		super("Сыр");
	}

	public void consume() {
		System.out.println(this + " съеден"); 

	}
	
	public Double CalculateCalories() {		
		if(this.name == "Сыр"){
			calories = 30.0;
			return calories;
			}
		else
			return 0.0;
		}

}
