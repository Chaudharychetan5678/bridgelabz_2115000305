public class dividepen{
	public static void main(String[] args){
		
		int total_pen = 14;
		int student_count = 3;
		
		int divided_pen = total_pen / student_count;
		 int pen_left = total_pen % student_count;
		
		System.out.print("The Pen Per Student is " + divided_pen + " and the remaining pen not distributed is "+ pen_left );

	}
}
