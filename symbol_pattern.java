import java.util.Scanner;
class symbol_pattern{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the no of characters to be printed:");
        int n=a.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=a.next();
        }
        System.out.println("\nMax number of times to be printed:");
        int n1=a.nextInt();
        a.close();
        for(int i=0;i<n1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i].charAt(0)+" ");
            }
            System.out.println();
        }
    }
}