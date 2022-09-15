import java.util.Scanner;
public class Squareand_cube_ofDecimal{
  public static void main(String[]args){
    double s;
    int square,cube;
    System.out.print("Given Number: ");
    Scanner as = new Scanner(System.in);
    s = as.nextDouble();
   
    System.out.println("Square Number: "+s*s);
   
    System.out.println("Cube Number: "+s*s*s);
  }
}