import javafx.util.Pair;
import java.util.*;

public class PairC {
    public static void main(String[] args) {
        Pair<String,String> p = new Pair<>("Bangladesh","Dhaka");
        System.out.println(p.getKey()+" "+p.getValue());
        
        ArrayList<Pair<Integer,Integer>> arr = new ArrayList<>();
        arr.add(new Pair<Integer,Integer>(5,92));
        arr.add(new Pair<Integer,Integer>(2,84));
        arr.add(new Pair<Integer,Integer>(1,90));
        arr.add(new Pair<Integer,Integer>(4,80));
        arr.add(new Pair<Integer,Integer>(3,80));
        
        
        Collections.sort(arr,new Comparator<Pair<Integer,Integer>>(){
            public int compare(Pair<Integer,Integer> p1, Pair<Integer,Integer> p2){
                if(p1.getValue()==p2.getValue()) return p1.getKey()-p2.getKey();
                else return p2.getValue()-p1.getValue();
            }
        });
        
        System.out.println(arr);
    }
}