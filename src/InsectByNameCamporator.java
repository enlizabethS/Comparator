import java.util.Comparator;

public class InsectByNameCamporator  implements Comparator<Insect> {

    @Override
    public int compare(Insect o1, Insect o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
