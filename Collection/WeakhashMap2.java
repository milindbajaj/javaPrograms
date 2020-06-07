
import java.util.HashMap;
import java.util.Map;
public class WeakhashMap2 {
    public static void main(String[] args) {
        Map<Number, String> a = new HashMap<>();
        a.put(1, "marvel");
        a.put(2, "antman");
        a.put(3, "nat");
        Map<Number, String> a1 = new HashMap<>();

        a1.putAll(a);
        System.out.println("getting second element:"+a1.get(2));
        System.out.println("Size of map is:" + a1.size());
        System.out.println("removing second element:");
a1.remove(2);
        System.out.println("New Size of map is:" + a1.size());

    }
}
