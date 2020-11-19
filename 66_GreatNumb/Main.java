package pkg66_greatest;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(8);
    list.add(7);
    list.add(2);

    System.out.println("The greatest number is: " + greatest(list));
        
    }
     
    public static int greatest(ArrayList<Integer> list) {
   
        int greatest = 0;
        
        for(int numb : list){
            if(numb > greatest){
                greatest = numb;
            }
        }
        return greatest;
    }
    
}
