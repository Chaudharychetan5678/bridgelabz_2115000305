import java.util.Scanner;
public class vote{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= sc.nextInt();
        if(age>=18){
         System.out.println("the person's age is " +age+ " and can vote");
          }
        else{
            System.out.println("the person's age is " +age+ " and cannot vote");

         }
  }
}
