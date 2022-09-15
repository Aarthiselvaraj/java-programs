import java.util.Scanner;  
public class Remove_dublicate_elements {  
    public static void main(String[] args) {  
      Scanner as= new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n = as.nextInt();
      int arr[] = new int[n];
      int ar[] = new int[100];
      System.out.println("Enter " +n+ " array elements between 0 to 100 ");
      for(int i=0; i<n; i++) {
         arr[i] = as.nextInt();
     }
     System.out.println("Array elements after removing duplicates");
      for(int i=0;i<n;i++){
        ar[arr[i]]++;
        if(ar[arr[i]]==1){
            System.out.println(arr[i]);
        }
    }
 }
}   