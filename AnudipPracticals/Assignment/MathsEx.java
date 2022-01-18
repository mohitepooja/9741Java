import java.util.*;
public class MathsEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer=");
		int a=sc.nextInt();
		System.out.println("Enter 2nd integer=");
		int b=sc.nextInt();
		System.out.println("Enter 3rd integer=");
		int c=sc.nextInt();
		//Calculate the sum
		int sum=a+b+c;
		System.out.println("sum="+sum);
		//Calculate the average
		int avg=sum/3;
		System.out.println("Average="+avg);
		
		//find the minimum number
		if(a<b && a<c) {
			System.out.println("min is="+a);
		}
		if(b<a && b<c) {
			System.out.println("min is="+b);
			
		}
		if(c<a && c<b) {
			System.out.println("min is="+c);
		}
		
		//find the maximum number
		if(a>b && a>c) {
			System.out.println("max is="+a);
		}
		if(b>a && b>c) {
			System.out.println("max is="+b);
			
		}
		if(c>a && c>b) {
			System.out.println("max is="+c);
		}
		
		}

}
