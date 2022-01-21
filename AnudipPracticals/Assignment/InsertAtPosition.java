import java.util.LinkedList;
public class InsertAtPosition {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Priya");
		list.add("Pooja");
		list.add("Deepika");
		list.add("Pournima");
		System.out.println("Original linked list= "+list);
		
		list.add(2,"Pranjali");
		System.out.println("Final linked list= "+list);

	}

}
