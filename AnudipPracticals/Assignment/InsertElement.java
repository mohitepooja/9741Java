import java.util.LinkedList;
public class InsertElement {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("White");
		list.add("Pink");
		list.add("Blue");
		System.out.println("Original linked list= "+list);
		//inserting element at the front of Linked List
		list.offerFirst("Red");
		System.out.println("Final linked list= "+list);

	}

}
