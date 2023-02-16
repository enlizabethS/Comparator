import java.util.Comparator;

public class InsectByNumberEComp implements Comparator<Insect> {

    @Override
    public int compare(Insect o1, Insect o2) {
        return Integer.compare(o1.getNumberOfE(),o2.getNumberOfE());
    }

    @Override
    public Comparator<Insect> reversed() {
        return Comparator.super.reversed();
    }
}
