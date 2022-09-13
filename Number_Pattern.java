import java.util.Scanner;
public class Number_Pattern {

public static void main(String[] args) {
int rows,num;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number to be printed:");
num=sc.nextInt();
Scanner as=new Scanner(System.in);
System.out.print("enter the max no.of time period:");
rows=as.nextInt();
for (int i=0; i<=rows-1;i++) {
for (int j = 0; j <= i;j++) {
System.out.print(num);
}
System.out.println("");
}
for (int i = rows-1; i >= 0; i--) {
for (int j = 0; j <= i-1; j++) {
System.out.print(num);
}
System.out.println();
}
}
}