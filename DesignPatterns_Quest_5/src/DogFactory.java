

public class DogFactory {

	public static Dog returnDog(String criteria) {
	    if ( criteria.equals("Small") )
	        return new SmallDog();
	      else if ( criteria.equals("Medium") )
	        return new MediumDog();
	      else if ( criteria.equals("Large") )
	        return new LargeDog();
		return null;
	}
}
