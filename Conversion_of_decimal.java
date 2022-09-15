import java.util.Scanner;
class Conversion_of_decimal {
 public static void main(String[] args) {
 Scanner as = new Scanner(System.in);
 System.out.print("enter the decimal number:");
 int decimal = as.nextInt();
 String binary = Integer.toBinaryString(decimal);
 System.out.println("BINARY IS " + binary);
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(decimal));
 }
}