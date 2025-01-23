import java.util.Scanner;
public class Countdown2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the countdown value : ");
		int countdown = sc.nextInt();
		for(int i=0; i<10;i++){
			System.out.println(countdown);
			countdown--;
		}
	}
}
