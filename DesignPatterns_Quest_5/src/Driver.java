
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog smallDog = DogFactory.returnDog("small");
		smallDog.speak();
		
		Dog medDog = DogFactory.returnDog("Medium");
		medDog.speak();
		
		Dog largeDog = DogFactory.returnDog("Large");
		largeDog.speak();
		
	}

}
