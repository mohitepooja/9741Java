import java.util.*;
class TryCatchEx2{
public static void main(String args[]){
try{
int n1,n2;
System.out.println("Enter two numbers=");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
int result=n1/n2;
System.out.println("Division = "+result);
try{
int[] arr=new int[3];
arr[10]=20;
System.out.println("Array value="+arr[10]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("the array is out of bound");
}}
catch(Exception e){
System.out.println("the second number cannot be zero");
}
		
}}