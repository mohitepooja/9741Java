import java.util.*;
public class ArrayIsEmpty {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(5);
		 boolean check=list.isEmpty();
		 
		 if(check==true) {
			 System.out.println("The array list empty");
			 }
		 else {
			 System.out.println("The array list is not empty");
		 }
		 
		 list.add("5");
		 check=list.isEmpty();
		 if(check==true) {
			 System.out.println("The array list empty");
			 }
		 else {
			 System.out.println("The array list is not empty");
		 }
		 
	    

	}

}
