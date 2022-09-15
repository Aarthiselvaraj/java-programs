import java.util.Scanner;
class Remove_Vowels{
  public static void main(String args[]){
    Scanner as=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=as.nextLine();
    str=str.replaceAll("[aeiouAEIOU]","");
    System.out.println("The string without vowel is:"+str);
  }
}