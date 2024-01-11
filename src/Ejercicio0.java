import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio0 {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Mikael", 2500));
        humans.add(new Human("Matti", 1800));
        humans.add(new Human("Ada", 1500));

        humans.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
