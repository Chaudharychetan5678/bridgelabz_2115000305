import java.util.Scanner;
public class checkdivisible{
     public static void main(String args[]){
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter the number:");
           int num= sc.nextInt();
           if(num%5==0){
               System.out.println("yes the number " +num+ " is divisible by 5");
           }
           else{
                System.out.println("No the number " +num+ " is  not divisible by 5");

            }
             
     }
}
