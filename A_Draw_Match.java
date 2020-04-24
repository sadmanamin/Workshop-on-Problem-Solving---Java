import java.util.*;

public class A_Draw_Match{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a,b,c,d;
    
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    
    if(a*d == b*c) System.out.println("Yes");
    else System.out.println("No");
    
    }
}