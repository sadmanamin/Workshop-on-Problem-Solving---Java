import java.util.*;

public class Array_List{
    public static void main(String[] args){
        
        int[] array = new int[10]; //Size fixed. Cannot be changed.
        array[0] = 10;
        
        System.out.println(array);
        
        //array[0];
        
        
        ArrayList<Long> arr = new ArrayList<Long>();
        
        arr.add(10); //add an integer
        arr.add(20);
        arr.add(15);
        arr.add(30);
        arr.add(5);
        arr.add(40);
        
        for(int c=0;c<arr.size();c++){
            System.out.println(arr.get(c));//access an index using get
        }
        System.out.println(arr);
        
        arr.remove(2);//remove an index value
        
        for(int c=0;c<arr.size();c++){
            System.out.println(arr.get(c));
        }
        
        
        System.out.println("-----------");
        
        System.out.println(arr);//printing whole arraylist as a String
        
        System.out.println(arr.contains(10));
        
        List<Integer> sublist = arr.subList(0, 5);
        
        System.out.println(sublist.get(2));
    }
}