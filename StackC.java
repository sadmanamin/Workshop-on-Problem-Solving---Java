//Check whether the parentheses are ok or not.
// [[()}]




import java.util.*;

public class StackC {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(4);
        st.push(8);
        st.push(9);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
        
        while(st.empty()==false){
            System.out.println(st.pop());
            //st.pop();
        }
        
        /*String s = "[[()}]";
        Stack<Character> sc = new Stack<Character>();
        
        
        for(int c=0;c<s.length();c++){
            if(s.charAt(c)=='[' || s.charAt(c)=='{' || s.charAt(c)=='(') sc.push(s.charAt(c));
            else if(){
                if(sc.empty()) ;//
                else{
                    if((s.charAt(c)==']' && s.peek()=='[') || () || ()) s.pop();
                    else break;
                }
                    
                    
            }
        }*/
        
    }
}