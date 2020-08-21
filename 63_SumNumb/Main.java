package pkg59_reverseorder;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Type a word: ");
        String word = cin.nextLine();
        ArrayList<String> list = new ArrayList<>();
        
        while(!word.equals("")){
            list.add(word);
            System.out.println("Type a word: ");
            word = cin.nextLine();
        }
        
        //Collections.sort(list);
        Collections.reverse(list);
        
        for(String entry : list){
            System.out.println(entry);
        }
    }
    
}
