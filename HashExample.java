import java.util.HashMap;
public class HashExample
{
	public static void main(String[] args) {
	    
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("India", "Pune");
	    capitalCities.put("USA", "LA");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Japan", "Tokyo");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.size());
	    
		for(String i : capitalCities.values())
	    {
	        System.out.println(i);
	    }
	}
}
