import java.util.LinkedList;
public class InsertElements {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Priya");
		list.add("Pooja");
		list.add("Deepika");
		System.out.println("Original linked list= "+list);
		
		LinkedList<String> newList=new LinkedList<String>();
		newList.add("Pranjali");
		newList.add("Pournima");
		
		list.addAll(1,newList);
		System.out.println("Final Linked List= "+list);

	}

}
