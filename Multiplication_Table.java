import java.util.Scanner;
public class Multiplication_Table{
  public static void  main(String[]args){
    int num,rows;
    System.out.print("M = ");
    Scanner sa = new Scanner(System.in);
    num = sa.nextInt();
    System.out.print("N=");
    Scanner as = new Scanner(System.in);
    rows = as.nextInt();
    for (int i = 1; i <= rows;i++){
      System.out.print(i+"X"+num+"=" +num*i+"\n");
      
    }
  }
}