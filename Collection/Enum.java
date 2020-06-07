
public class Enum {
    public enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) 
{
        System.out.println("Getting season with enum:");
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
