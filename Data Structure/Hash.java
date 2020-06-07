import java.util.*; 
  
class Hash { 
    public static void main(String args[]) 
    { 
  
        // Create a HashTable to store  
        // String values corresponding to integer keys 
        Hashtable<Integer, String> 
            hm = new Hashtable<Integer, String>(); 
  
        // Input the values 
        hm.put(1, "marvel"); 
        hm.put(84, "hulk"); 
        hm.put(48, "thor"); 
        hm.put(2, "Ironman"); 
  
        // Printing the Hashtable 
        System.out.println(hm); 
    } 
} 