import java.util.ArrayList;
import java.util.List;

public class tesoroTutankamon {
    public static void main(String[] args) {
        List<Tutankamon> tesoros = new ArrayList<>();
        int contador = 0;
        tesoros.add(new Tutankamon(contador++, "flecha", 5, 1));
        tesoros.add(new Tutankamon(contador++, "sandalias", 10, 2));
        tesoros.add(new Tutankamon(contador++, "sarcofago", 1000, 1000));
        tesoros.add(new Tutankamon(contador++, "mascara", 1000, 10));
        tesoros.add(new Tutankamon(contador++, "arco", 10, 2));
        tesoros.stream().sorted().forEach(System.out::println);
    }
}
