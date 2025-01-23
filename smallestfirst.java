import java.util.Scanner;
public class smallestfirst{
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number:");
          int first=sc.nextInt();
          System.out.println("Enter the second number:");
           int second=sc.nextInt();
            System.out.println("Enter the third number:");
          int third=sc.nextInt();
          if(first<second){
              if(first<third){
                System.out.println("Yes first number is the smallest number");
               }
              else{
                 System.out.println("No the first number is not the smallest number");

               }
          }
          else{
               System.out.println("No first number is not the smallest number");
           }

         
      }
}
