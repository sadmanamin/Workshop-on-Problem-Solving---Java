import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        //From Geeksforgeeks
        
        HashSet<Integer> h1 = new HashSet<Integer>();
        
        h1.add(10);
        h1.add(5);
        h1.add(10);
        h1.add(3);
        h1.add(3);
        h1.add(1);
        System.out.println(h1); 
        
        
        
        HashSet<String> h = new HashSet<String>(); 
        
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
        
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
        
        // Removing items from HashSet using remove() 
        
        
        
        
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
        
    }
}