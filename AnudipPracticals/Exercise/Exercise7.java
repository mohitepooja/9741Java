import java.util.Scanner;
public class Exercise7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Input the 1st number: ");
int a=sc.nextInt();
System.out.println("Input the 2nd number: ");
int b=sc.nextInt();
System.out.println("Input the 3rd number: ");
int c=sc.nextInt();
if(a>b && a>c){
System.out.println("The greatest: "+a);}
else if(b>a && b>c){
System.out.println("The greatest: "+b);}
else{
System.out.println("The greatest: "+c);}
}}
