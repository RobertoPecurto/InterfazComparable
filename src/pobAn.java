import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class pobAn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/illiterate.csv"));
        String line;
        ArrayList<Human> analfabetos = new ArrayList<>();
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] actual = line.split(",");
            String name = actual [5];
            int cantidad = Integer.parseInt(actual[8]);
            analfabetos.add(new Human(name , cantidad));
        }

        analfabetos.stream()
            .sorted()
            .forEach(System.out::println);

    }
}
