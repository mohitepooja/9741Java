import java.util.LinkedList;
public class InsertEnd {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Priya");
		list.add("Pooja");
		list.add("Deepika");
		System.out.println("Original linked list= "+list);
		//inserting element at the end of the Linked List
		list.offerLast("Pranjali");
		System.out.println("Final Linked List= "+list);

	}

}
