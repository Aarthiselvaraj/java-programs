import java.util.Scanner;
public class Max_min {
 public static void main(String[] args){
 Scanner as = new Scanner(System.in);
 System.out.print("Enter the size of the array:");
 int n=as.nextInt();
 System.out.println("enter the numbers:");
 int[] array = new int[n];
 for(int i=0; i<n; i++) {
 array[i]=as.nextInt();}
 int max = array[0];
 for (int j = 0; j < array.length; j++){
 if (array[j] > max)
 max = array[j];}
 System.out.println("maximum number="+max);
 int min = array[0];
 for (int s=0;s<array.length;s++){
 if (array[s]< min)
 min=array[s];}
 System.out.println("minimum number="+min);
 System.out.println("addition of max & min="+" "+(max+min));
 System.out.println("subtraction of min & max="+" " +(max-min));
 }
}