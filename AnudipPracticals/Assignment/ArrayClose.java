import java.util.*;
public class ArrayClose {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Pooja");
		list1.add("Pranjali");
		list1.add("Deepika");
		System.out.println("Original array="+list1);
		ArrayList<String> list2=(ArrayList<String>)list1.clone();
		System.out.println("Cloned Array="+list2);
		

	}

}
