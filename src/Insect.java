public class Insect {
    private String title;
    private int numberOfE;
    private int numberOfW;

    public Insect(String title, int numberOfE, int numberOfW) {
        this.title = title;
        this.numberOfE = numberOfE;
        this.numberOfW = numberOfW;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfE() {
        return numberOfE;
    }

    public int getNumberOfW() {
        return numberOfW;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "title='" + title + '\'' +
                ", numberOfE=" + numberOfE +
                ", numberOfW=" + numberOfW +
                '}';
    }
}
