package main;
import java.util.ArrayList;

import animals.*;
import data.Database;
public class Main {

	public static void main(String[] args) {
		
		Database database = new Database();
		
		ArrayList<Chicken> listChickens= database.createListChickens();
		ArrayList<Dog> listDogs= database.createListDogs();
		ArrayList<Parrot> listParrots = database.createListParrots();
		ArrayList<Animal> listAnimals = database.getListAnimals();
				
		//list all the chickens
		System.out.println("_____________________________________________");
		for (int i=0;i<listChickens.size();i++){
			System.out.println(listChickens.get(i).printDataChicken());
		}
		System.out.println("_____________________________________________");
		
		//list all the dogs
		System.out.println("_____________________________________________");	
		for (int d=0;d<listDogs.size();d++){
			System.out.println(listDogs.get(d).printDataDog());
		}
		System.out.println("_____________________________________________");
	    
		//list all the parrots
		System.out.println("_____________________________________________");
		for (int p=0;p<listParrots.size();p++){
			System.out.println(listParrots.get(p).printDataParrot());
		}
		System.out.println("_____________________________________________");
		
	
		//list all animals
		System.out.println("_____________________________________________");
		for (int a=0; a<listAnimals.size(); a++){
			System.out.println(listAnimals.get(a).dataAnimal());
		}
		System.out.println("_____________________________________________");
	}
		
}
