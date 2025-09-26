import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("dkas");
        list.add("Hello");
        list.add("open");
        
        List<String> newList = Collections.unmodifiableList(list);
        list.add("close");

        System.out.println(newList);
    }
}
