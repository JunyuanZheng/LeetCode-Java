import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Stream<Integer> stream = myList.stream().map(a -> a + 1);
        stream.forEach(System.out::println);
    }
}
