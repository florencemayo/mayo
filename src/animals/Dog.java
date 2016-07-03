package animals;

public class Dog extends Animal {

	private DogType dogType;
	
	public Dog(){}
	
	public Dog(String name,String favoriteFood, DogType dogType) {
		super(name,favoriteFood);
		this.dogType = dogType;
	}
	
	public DogType getDogType() {
		return dogType;
	}
	
	public void setDogType(DogType dogType) {
		this.dogType = dogType;
	}
	
	   public String printDataDog(){
	        String dogData="";
	  			   dogData+="Dog\n"+
	  					    "- Dog type : "+dogType.getName()+";\n";
	  				dogData+=this.dataAnimal();
	  			    return dogData;
	  	}
}
