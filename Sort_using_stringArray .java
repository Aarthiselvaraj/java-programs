import java.util.Arrays;
import java.util.Scanner;
public class Sort_using_stringArray 
{
    public static void main(String[] args) 
    {
       int n,i;
       
       Scanner as= new Scanner(System.in);
       
       System.out.print("Enter the number of words: ");
       n = as.nextInt();
       
       as.nextLine();
       
       String[] words = new String[n];
       
       System.out.println("Enter the words: ");
       for (int i = 0; i < n; i++) {
           words[i] = as.nextLine();
       }
        sortAlphabetically(words);
    }
    static void sortAlphabetically(String[] words) 
    {
        
        Arrays.sort(words);
        System.out.print("The words in alphabetical order are: " + Arrays.toString(words));
    }
}
