import java.util.*;
public class addLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("white");
		list.add("blue");
		list.add("pink");
		System.out.println("Linked liSt is "+list);
		
		list.addFirst("Gray");
		list.addLast("Red");
		System.out.println("After adding elements"+list);

	}

}
