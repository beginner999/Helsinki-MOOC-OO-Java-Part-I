package pkg65_thelengthofstrings;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
       
            ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Moi");
    list.add("Benvenuto!");
    list.add("badger badger badger badger");
    ArrayList<Integer> lengths = lengths(list);

    System.out.println("The lengths of the Strings: " + lengths);
        
    }
    
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
    
        ArrayList<Integer> NumbList = new ArrayList<>();
        
        for (String word : list){
            NumbList.add(word.length());
        }
        
        return NumbList;
    }

    
}
