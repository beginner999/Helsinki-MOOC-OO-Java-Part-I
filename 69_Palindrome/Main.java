package pkg69_palindrome;
import java.util.Scanner;

public class Main {

    
    
    
    
    public static void main(String[] args) {
        
            Scanner reader = new Scanner(System.in);

    System.out.println("Type a text: ");
    String text = reader.nextLine();
    if (palindrome(text)) {
       System.out.println("The text is a palindrome!");
    } else {
       System.out.println("The text is not a palindrome!");
    }
        
    }
    
    public static boolean palindrome (String text){
        
        String reversed = Reverse(text).toLowerCase();
        
        if(text.toLowerCase().equals(reversed)){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public static String Reverse(String text){
        int length = text.length()-1;
        String newWord = "";
        
        while(length >= 0){
            newWord = newWord +text.charAt(length);
            length--;
        }
        
        return newWord;
    }
    
}
