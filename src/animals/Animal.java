package animals;

import java.util.ArrayList;
import java.util.Random;

public class Animal implements PrintData {
	
	private String name;
	
	private String favoriteFood;
	
	private ArrayList<Animal> friends=new ArrayList<Animal>();

    public Animal(){}
    
	public Animal(String name, String favoriteFood) {
		super();
		this.name = name;
		this.favoriteFood = favoriteFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	public ArrayList<Animal> getFriends() {
		return friends;
	}
	
	public void setFriends(ArrayList<Animal> friends) {
		this.friends = friends;
	}

	//method to get a newly random friends
	public ArrayList<Animal> animalLoseFriend(){
		//remove if animal has any
		if (friends.size()>0) {
		//generate a random number from 0 to friends.size - 1
		Random random = new Random();
		Integer randomInt = random.nextInt(friends.size());
		System.out.println("Animal with index :"+randomInt+
				           "has been deleted");
		//remove the animal with that random number
		friends.remove(randomInt);
		}
		return friends;
	}
	
	//method to add a new friend
	public ArrayList<Animal> animalGetFriend(ArrayList<Animal> zoo){
		//generate a random number from 0 to friends.size - 1
		Random random1 = new Random();
		Integer randomInt1 = random1.nextInt(zoo.size());
		System.out.println("Animal with index : "+randomInt1+
				           " has been added");
		
		//add a new friend
		Animal newFriend = zoo.get(randomInt1);
		//add if and only if not SAME animal and
		//if A is a friend of B then B is a friend of A
		//if it is not already friend of all other animals).
		//TODO
		friends.add(newFriend);
		return friends;
	}
	
	@Override
	public String dataAnimal() {
		String data="";
		data+=	"- Name : "+this.getName()+";\n" +
				"- Favorite Food : "+this.getFavoriteFood()+";\n";
		
		//check if animal has friends
		if (friends.size()>0){
			data+= "- Friends :";
			
			for (int f=0; f<friends.size();f++){
				data+=" "+friends.get(f).getName();
				if (f+1<friends.size()) {
					data+=", ";
				}
			}
			data+=";";
		} else {
			data+= "- Friends : No friend;";
		}
		data+="\n";
		return data;
	}
		
}
