import java.util.*;
public class Length_of_substring{
   
    public static void main(String[] args){
        System.out.print("s:");
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        a.close();
        String str[]=new String[s.length()];
        int k=0;
        int max=0;
        
 
        str[0]=Character.toString(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int count=0;

            for(int j=0;j<=k;j++){
                if(str[j].charAt(0)==s.charAt(i)){
                    count++;
                }
            }
            if(count==0){
                
                k++;
                str[k]=Character.toString(s.charAt(i));
                
            }
             if(count!=0||i==s.length()-1){
            
                if(max<k){
                    max=k;
                }
                k=0;
                str[k]=Character.toString(s.charAt(i));
            }

            
        }
         
        System.out.print(max+1);
    }
    }
