package animals;

public class Parrot extends Animal {
  
	private boolean canSpeak;
	
	public Parrot(){}
	
	public Parrot(String name, String favoriteFood, boolean canSpeak) {
		super(name,favoriteFood);
		this.canSpeak = canSpeak;
	}

	public boolean getCanSpeak() {
		return canSpeak;
	}

	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}
	
	public String printDataParrot(){
       //Animal animal = new Animal();
	   String parrotData="";
	   parrotData+="Parrot\n"+
                 "- "+(this.getCanSpeak()? "Can speak.":"Cannot speak.")+"\n";
	   parrotData+=this.dataAnimal();
	   return parrotData;
	}
}
