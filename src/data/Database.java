package data;

import java.util.ArrayList;

import animals.*;

public class Database {
    //Instantiate the list of all kind of animals
	private ArrayList<Animal> listAnimals = new ArrayList<Animal>();
	//list of chickens
	private ArrayList<Chicken> listChickens;
	//list of dogs
	private ArrayList<Dog> listDogs;
	//list of parrots
	private ArrayList<Parrot> listParrots;

	public Database (){}
	
	public ArrayList<Chicken> getListChickens() {
		return listChickens;
	}
	public void setListChickens(ArrayList<Chicken> listChickens) {
		this.listChickens = listChickens;
	}
	
	public ArrayList<Dog> getListDogs() {
		return listDogs;
	}
	public void setListDogs(ArrayList<Dog> listDogs) {
		this.listDogs = listDogs;
	}
	
	public ArrayList<Parrot> getListParrots() {
		return listParrots;
	}
	public void setListParrot(ArrayList<Parrot> listParrots) {
		this.listParrots = listParrots;
	}
	//---------------------------ADD CHICKENS-----------------
	public ArrayList<Animal> getListAnimals() {
		return listAnimals;
	}

	public void setListAnimals(ArrayList<Animal> listAnimals) {
		this.listAnimals = listAnimals;
	}

	public ArrayList<Chicken> createListChickens() {
		//instantiate new array of chickens
		listChickens = new ArrayList<Chicken>();
		
		//new variables of chickens
		Chicken chicken_one=new Chicken("Chicken one", "Corn", 0.75,true);
		Chicken chicken_two=new Chicken("Chicken two", "Corn", 0.75,false);
		Chicken chicken_three=new Chicken("Chicken three", "Corn", 0.75,false);
		Chicken chicken_four=new Chicken("Chicken four", "Corn", 0.75,false);
		Chicken chicken_five=new Chicken("Chicken five", "Corn", 0.75,false);
		 
		//chickens are animals too
		Animal animal_one = chicken_one;
		Animal animal_two = chicken_two;
		Animal animal_three = chicken_three;
		Animal animal_four = chicken_four;
		Animal animal_five = chicken_five;
		
		
		//add chickens to an array of chickens
		listChickens.add(chicken_one);
		listChickens.add(chicken_two);
		listChickens.add(chicken_three);
		listChickens.add(chicken_four);
		listChickens.add(chicken_five);
		
		//add chickens to an array of animals
		listAnimals.add(animal_one);
		listAnimals.add(animal_two);
		listAnimals.add(animal_three);
		listAnimals.add(animal_four);
		listAnimals.add(animal_five);
		
		//set friendships
		chicken_one.animalGetFriend(listAnimals);
		chicken_one.animalGetFriend(listAnimals);
		
		return listChickens;
	}
	
	//---------------------------ADD DOGS-----------------------
	public ArrayList<Dog> createListDogs(){
		//instantiate new array of Dogs
		listDogs = new ArrayList<Dog>();
		
		Dog dog_one = new Dog("Dog one","Pedigree",DogType.Asistance_Dog);
		Dog dog_two = new Dog("Dog otwo","Fresh meat",DogType.Hunting_Dog);
		Dog dog_three = new Dog("Dog three","Meat",DogType.Racing_Dog);
		Dog dog_four = new Dog("Dog four","Meat",DogType.Racing_Dog);
		Dog dog_five = new Dog("Dog five","Pedigree",DogType.Hunting_Dog);
		
		//Dogs can also be animals
		Animal animal_one = dog_one;
		Animal animal_two = dog_two;
		Animal animal_three = dog_three;
		Animal animal_four = dog_four;
		Animal animal_five = dog_five;
		
		//add dogs to an array of dogs
		listDogs.add(dog_one); 
		listDogs.add(dog_two); 
		listDogs.add(dog_three); 
		listDogs.add(dog_four); 
		listDogs.add(dog_five); 
		
		//add dogs to an array of animals
		listAnimals.add(animal_one);
		listAnimals.add(animal_two);
		listAnimals.add(animal_three);
		listAnimals.add(animal_four);
		listAnimals.add(animal_five);
		
		return listDogs;
	}
	
	//---------------------------ADD PARROT-----------------------
	public ArrayList<Parrot> createListParrots(){
		//instantiate new list of Parrots
		listParrots = new ArrayList<Parrot>();
		
		//set new objects of parrots
		Parrot parrot_one = new Parrot("Parrot one", "Grain", true);
		Parrot parrot_two = new Parrot("Parrot two", "Corn", false);
		Parrot parrot_three = new Parrot("Parrot three", "Grain", false);
		Parrot parrot_four = new Parrot("Parrot four", "Corn", false);
		Parrot parrot_five = new Parrot("Parrot five", "Grain", true);
		
		//Add parrots to an array of parrots
		listParrots.add(parrot_one); 
		listParrots.add(parrot_two); 
		listParrots.add(parrot_three); 
		listParrots.add(parrot_four);	
		listParrots.add(parrot_five); 
		
		//add parrots to an array of animals
		listAnimals.add(parrot_one);
		listAnimals.add(parrot_two);
		listAnimals.add(parrot_three);
		listAnimals.add(parrot_four);
		listAnimals.add(parrot_five);
		
		return listParrots;
	}
	
	
	
}
