package pkg67_variance;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        
            ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The variance is: " + variance(list));
        
    }
    
    
    public static double average(ArrayList<Integer> list){
    
        double sum = 0;
        
        for(int numb : list){
            sum = sum + numb;
        }
        
        return sum/list.size();
            }
    
    public static double variance(ArrayList<Integer> list) {
    
        double Avg = average(list);
        double sum = list.size()- Avg;
        double sum2 = sum * sum;
        double SumOfTerms = 0;
        
        int SampleSize = list.size()-1;
        
        for(int numb : list){
            SumOfTerms = SumOfTerms + (numb-Avg) * (numb-Avg);
        }
        
        
        
        double Vari = SumOfTerms/SampleSize;
        
        return Vari;
        
            }
    
    
    
}
