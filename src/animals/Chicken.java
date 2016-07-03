package animals;

public class Chicken extends Animal {

	private Double wingSpan;
	
	private Boolean isBroiler;
	
	public Chicken(){}
	
	public Chicken(String name, String favoriteFood, Double wingSpan, Boolean isBroiler) {
		super(name, favoriteFood);
		this.wingSpan=wingSpan;
		this.isBroiler=isBroiler;
	}

	public Double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(Double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public Boolean getIsBroiler() {
		return isBroiler;
	}

	public void setIsBroiler(Boolean isBroiler) {
		this.isBroiler = isBroiler;
	}

	public String printDataChicken(){
		String chickenData="";
		chickenData+="Chicken\n" +
	                 "- Wingspan : "+this.getWingSpan()+";\n"+
		             "- "+(this.getIsBroiler()? "Is broiler.":"Is not broiler.");
		chickenData+=this.dataAnimal();
		return chickenData;
	}
	

}
