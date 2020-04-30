import java.util.*;

public class Sort_Tricks {
    public static void main(String[] args) {
        
        int[] ar = {3,2,1,4,3,5};
        
        Arrays.sort(ar);
        
        for(int c=0;c<ar.length;c++)System.out.println(ar[c]);
        
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10); 
        arr.add(15);
        arr.add(20);
        arr.add(5);
        arr.add(30);
        arr.add(40);
        
        
        
        //Collections.sort(arr,);
        
        System.out.println(arr);
        
        //Collections.sort(arr,Collections.reverseOrder());
        
        Collections.sort(arr, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
                
                //If compare returns -1 and 0, a will be chosen
                //If compare returns 1, b will be chosen
            }
        });
        System.out.println(arr);
    }
}