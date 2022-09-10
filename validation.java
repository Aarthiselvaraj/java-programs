import java.util.Scanner;
class validation {

    public static void main(String[] args){
    System.out.print("enter the username:");
     Scanner sc = new Scanner(System.in);
     String a = sc.nextLine();
     System.out.print("re-enter the username:");
     Scanner ce=new Scanner(System.in);
     String s=ce.nextLine();
     if(a==s)
   
      {
        System.out.println("username is Valid");
    } 
     else
      {
        System.out.println("Invalid username");
    }         

    }
}