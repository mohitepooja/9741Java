import java.util.*;
public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers=");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swap a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a="+a+" b="+b);

	}

}
