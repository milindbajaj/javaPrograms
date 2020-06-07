import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class WeakhashMap1 {
    public static void main(String[] args) {
        Map<Number, String> a = new HashMap<>();
        a.put(1, "thor");
        a.put(2, "hulk");
        a.put(3, "iornman");
        Set set = a.entrySet();
        System.out.println(set);
        Set keySet = a.keySet();
        System.out.println("keyset is:" + keySet);

    }
}
