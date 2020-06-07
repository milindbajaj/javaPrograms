import java.util.LinkedList;
public class Linkedlst1 {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("xmen");
        lst.add("hulk");
        lst.add("thor");
        lst.add("ironman");

        System.out.println(lst);
        System.out.println("remove :" + lst.remove(0));

        System.out.println(lst);
        System.out.println("remove:" + lst.remove(1));

        //System.out.println(lst);
        //System.out.println("remove :" + lst.remove(2));

        System.out.println("After Removing ,remaining list:");
        System.out.println(lst);
        

    }


}


