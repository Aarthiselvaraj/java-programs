import java.util.Scanner;
 
public class PalindromeString {
 
    public static void main(String args[]){
 
        Scanner as = new Scanner(System.in);
        
        String str, rev="";
 
        System.out.println("Enter a String");
        str= as.nextLine();
 
        for(int i=str.length()-1 ; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
            System.out.println(rev+"is a Palindrome String");
        else
            System.out.println(rev+"is not a Palindrome String");
    }
}