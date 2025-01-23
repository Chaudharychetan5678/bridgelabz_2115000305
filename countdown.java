import java.util.Scanner;
public class countdown{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the countdown value : ");
		int countdown = sc.nextInt();
		while(countdown!=0){
			System.out.println(countdown);
			countdown--;
		}
	}
}
