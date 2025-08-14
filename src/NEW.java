import java.util.ArrayList;
import java.util.List;

public class NEW {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("bangan");
        list.add("blank");
        list.add("apple");
        list.add("cat");

        list.stream()
                .filter(s->s.startsWith("b"))
                .forEach(System.out::println);


    }

}
