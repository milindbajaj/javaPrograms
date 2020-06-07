import java.util.Iterator;
import java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> a = new Vector<>();
        a.add("modi");
        a.add("trump");
        a.add("imran");
        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
