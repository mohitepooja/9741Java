import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Pooja");
		list1.add("Pranjali");
		list1.add("Deepika");
		
		System.out.println("ArrayList 1="+list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Harshu");
		list2.add("JJ");
		list2.add("Usha");
		
		System.out.println("ArrayList2="+list2);
		
		list1.addAll(list2);
		System.out.println("Joined ArrayList="+list1);
	}

}
