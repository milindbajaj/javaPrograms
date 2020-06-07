import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("kalu");
        a.add("ram");
        a.add("lakhan");
        System.out.println("linkedhashset size:" + a.size());
        System.out.println("Original Linkedhashset:" + a);
        System.out.println("Removing Ram from Linkedhashset: " + a.remove("ram"));
        System.out.println("update Linkedhashset:" + a);
    }
}
