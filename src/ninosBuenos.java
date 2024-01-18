import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ninosBuenos {
    public static void main(String[] args) {
        List<Buenos> ninos = new ArrayList<>();
        ninos.add(new Buenos(80,2));
        ninos.add(new Buenos(100,12));
        ninos.add(new Buenos(100,1));
        ninos.stream()
                .sorted()
                .forEach(System.out::println);

        ninos = new ArrayList<>();
        ninos.add(new Buenos(1,1));
        ninos.add(new Buenos(1,1));
        ninos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}