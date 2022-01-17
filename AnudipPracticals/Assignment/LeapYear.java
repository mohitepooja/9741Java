import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an year=");
		int year=sc.nextInt();
		System.out.println(year);
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))  {
			System.out.println("Leap Year="+year);
		}
		else {
			System.out.println("Not Leap year="+year);
		}

	}

}
