package assisted_practice;
import java.util.*;
public class Collections_Program {
	public static void main(String[] args) {
		System.out.println("Array List");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Vijayawada");
		city.add("Guntur");
		System.out.println("Array List are"+city);
		city.clear();
		city.add("Hyderabad");
		System.out.println("After clear Array List is="+city);
	    System.out.println("Vector");
	    Vector<String> vec = new Vector();
	    vec.addElement("Right"); 
	    vec.addElement("left"); 
	    System.out.println("Vector elements are="+vec);
	    System.out.println("LinkedList");
	    LinkedList<String> names=new LinkedList<String>();  
	    names.add("Siva");  
	    names.add("Rama");  
	    System.out.println("Linked list elements are"+names);
	    Iterator<String> itr=names.iterator();  
	    while(itr.hasNext()){  
	    System.out.println(itr.next());  
	    System.out.println("HashSet");
	    HashSet<Integer> set=new HashSet<Integer>();  
	    set.add(101);  
	    set.add(103);  
	    set.add(102);
	    set.add(104);
	    System.out.println(set);
        System.out.println("LinkedHashSet");
	    LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
        set2.add(11);  
        set2.add(13);  
        set2.add(12);
	    set2.add(14);	       
	    System.out.println(set2);
	   	} 
	}
}
