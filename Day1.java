import java.util.*;

public class Main{ //Class name should be this
    public static void main(String[] args){
        
        //There cannot be any prompt messages.
        
        //Read constraints properly from the question.
        
        //Use long when you will see any of your variable in crossing 2^32-1 or in short 10^8 or 9 digits
        //Long is upto 10^19 or in short 19 digits.
        
        //Input of String after Int ----------------
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Takes the integer. Cursor stands next to the int.
        sc.nextLine(); //Takes the blank line after the int and goes to the next line.
        String s = sc.nextLine(); //Takes the String
        
        //Input until EOF/End of File
        
        while(sc.hasNext()){
            //rest of the code for every input
        }
        
        //Output should be exactly same to that of the question
        
        //BuffuredReader for Faster IO -------------------------------------
        
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r); //br object will be used for all input.
        
        //br takes every input as a string
        
        /*for a input like
         * 2
         * 3
         * 4
         */
        
        String s;
        
        for(int c=0;c<3;c++){
            s = br.readLine();
            int a = Integer.parseInt(s);
        }
        
        /*for a input like
         * 2 3 4
         */
        
        s = br.readLine();
        String[] nums = s.split(" "); //splits the string on " " and store the string values in nums array.
        
        for(int c=0;c<nums.length;c++){
            int a = Integer.parseInt(nums[c]);
        }
        
        //For input until EOF using BufferedReader
        String a;
        while((a = br.readLine())!=null){
            System.out.println(Integer.parseInt(a));
        }
    }
}