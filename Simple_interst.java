import java.util.Scanner;
class Simple_intrest {
 public static void main(String[] args) {
 Scanner as=new Scanner(System.in);
 float P=as.nextFloat();
 float R=as.nextFloat();
 float T=as.nextFloat();
 float SI = (P * T * R) / 100;
 System.out.println("Simple interest = " + SI);
 }
}