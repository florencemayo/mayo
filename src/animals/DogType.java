package animals;

public enum DogType {
	Asistance_Dog("Asistance Dog"),
	Hunting_Dog("Hunting Dog"),
	Racing_Dog("Racing Dog");
	
	private String name;
	
	DogType(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
}
