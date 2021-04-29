package Day2;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();

    // Adding elements to the linked list
		System.out.println("Add");
    ll.add("A");
    ll.add("B");
    ll.addLast("C");
    ll.addFirst("D");
    ll.add(2, "E");

    System.out.println(ll);

    System.out.println("Remove");
    ll.remove("B");
    ll.remove(3);
    ll.removeFirst();
    ll.removeLast();

    System.out.println(ll);
    
    System.out.println("remove all");

    ll.removeAll(ll);
    System.out.println(ll);
    
    System.out.println("Clear");
    ll.add("A");
    ll.add("B");
    System.out.println(ll);
    ll.clear();
    System.out.println(ll);
    
    System.out.println("First and last occurance");
    ll.add("A");
    ll.add("B");
    ll.addLast("C");
    ll.addFirst("D");
    ll.add(2, "E");
    System.out.println(ll);
    ll.removeFirstOccurrence("D");
    ll.removeFirstOccurrence("C");
    System.out.println(ll);
	}

}
