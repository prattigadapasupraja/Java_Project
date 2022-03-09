package assisted_practice;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class Map_program {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Ram");    
	      hm.put(2,"Ravi");    
	      hm.put(3,"Siva");         
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){
	       System.out.println(m.getKey()+" "+m.getValue());
	       }
	       Hashtable<Integer,String> ht=new Hashtable<Integer,String>();    
		      ht.put(4,"sita");  
		      ht.put(5,"parvathi");  
		      ht.put(6,"Durga");  
		      ht.put(7,"Maha Lakshmi");  
		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());  
		      }
		       TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"yamini");    
			      map.put(9,"ramya");    
			      map.put(10,"lakshmi");       
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue()); 
		      }
	      }
}