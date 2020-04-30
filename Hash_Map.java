import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        
        int[] arr = new int[3];
        
        arr[0]     =   10;
        arr[1]     =   20;
        arr[2]     =   30;
        //  ^key/index ^value
        
        HashMap<Character, Integer> charac = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        
        for(int c=0;c<10;c++){
            char ch = sc.next().charAt(0);
            if(charac.containsKey(ch)){
            charac.put(ch,charac.get(ch)+1);
            }
            else charac.put(ch,1);
        }
        
        
        
        System.out.println(charac.get('a'));
        
        /*capitalCities1.put(10, "London");
        capitalCities1.put(5, "Berlin");
        capitalCities1.put(7, "Oslo");
        capitalCities1.put(3, "Washington DC");
        
        System.out.println(capitalCities1);
        
        
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println("--------\n");
        
        System.out.println(capitalCities.get("Germany"));
        
        
        System.out.println(capitalCities.containsKey("Bangladesh")); //checks if key exists or not
        
        System.out.println(capitalCities.size());
        
        System.out.println(capitalCities.keySet());
        
        Iterator<String,String> it = capitalCities.iterator();
        
        for(String i: capitalCities.keySet()){
            System.out.println(i+": "+capitalCities.get(i));
        }
        System.out.println("--------\n");
        
        capitalCities.remove("Germany");
        
        System.out.println(capitalCities);*/
        
        
    }
}