import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class laJusticiaDeLaLoteria {
    public static void main(String[] args) {
        List<Loteria> loterias = new ArrayList<>();
        loterias.add(new Loteria(9, 4));
        loterias.add(new Loteria(10, 6));
        loterias.add(new Loteria(9, 5));
        loterias.add(new Loteria(1, 3));
        System.out.println(esJusto(loterias));

        loterias = new ArrayList<>();
        loterias.add(new Loteria(10, 5));
        loterias.add(new Loteria(20, 5));
        loterias.add(new Loteria(30, 5));
        System.out.println(esJusto(loterias));

    }

    public static String esJusto(List<Loteria> loterias) {
        for (int i = 0; i < loterias.size(); i++) {
            if (loterias.get(i).getInversion() > loterias.get(i + 1).getInversion()) {
                if (loterias.get(i).getPremio() < loterias.get(i + 1).getPremio()) {
                    return "NO";
                }
            } else if (loterias.get(i).getInversion() < loterias.get(i + 1).getInversion()) {
                if (loterias.get(i).getPremio() >= loterias.get(i + 1).getPremio()) {
                    return "NO";
                }
            }
            return "SI";
        }
        return null;
    }
}
