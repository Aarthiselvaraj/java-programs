import java.util.Scanner;
public class Numberof_Factors {

  public static void main(String[] args) {
    int number;
    int count = 0;
    System.out.print("Given Number: ");
    Scanner sa = new Scanner (System.in);
    number= sa.nextInt();
   

    System.out.print("Number of Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        count++;
        
      }
     
    }
    System.out.println(count);
  }
}