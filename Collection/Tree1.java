import java.util.SortedSet;
import java.util.TreeSet;
public class Tree1 {
    public static void main(String[] args) {
        SortedSet<String> str = new TreeSet<>();
        str.add("mumbai");
        str.add("delhi");
        str.add("chennai");
        str.add("kolkata");
        str.add("hyderabad");
 System.out.println("getting elements in tree");
        for (String s : str) {
            System.out.println(s);
        }


    }


}
