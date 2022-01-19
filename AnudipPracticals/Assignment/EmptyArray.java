import java.util.*;
public class EmptyArray {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(4);
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		System.out.println("ArrayList is= "+list1);
		
		int size=list1.size();
		System.out.println("ArrayList contains "+size+" elements");
		
		list1.clear();
		
		int newSize=list1.size();
		System.out.println("After operation ArrayList contains "+newSize+" elements");
		
		
		

	}

}
