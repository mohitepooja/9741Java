import java.util.Scanner;
public class Exercise5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Input a number: " );
int n=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(n+" x "+i+" = "+(n*i));
}
}
}
