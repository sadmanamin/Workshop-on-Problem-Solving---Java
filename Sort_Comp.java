import java.util.*;

public class Sort_Comp {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(5,92));
        arr.add(new Student(2,80));
        arr.add(new Student(1,85));
        arr.add(new Student(4,82));
        arr.add(new Student(3,82));
        
        Collections.sort(arr,new Comparator<Student>(){
            public int compare(Student a, Student b){
                if(a.marks==b.marks) return a.roll-b.roll;
                else return b.marks-a.marks;
            }
        });
        
        System.out.println(arr);
        
    }
}

class Student{
    int roll;
    int marks;
    public Student(int x, int y){
        roll = x;
        marks = y;
    }
    
    public String toString(){
        return roll+" = "+marks;
    }
}

class SortStudent implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.marks==b.marks) return a.roll-b.roll;
        else return b.marks-a.marks;
    }
}