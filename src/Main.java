import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Insect> insects = new ArrayList<>();
        insects.add(new Insect("Fly",5,2));
        insects.add(new Insect("Bee",5000,2));
        insects.add(new Insect("Spider",8,0));
        insects.add(new Insect("Dragonfly",10000,4));
        Collections.sort(insects,new InsectByNameCamporator());
        for (Insect in: insects){
            System.out.println(in);
        }
        System.out.println("-----------------");
        Collections.sort(insects,new InsectByNumberEComp());
        for (Insect in: insects){
            System.out.println(in);
        }

        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        switch (ans){
            case 1: {
                insects.sort(new InsectByNameCamporator());
            } case 2:{
                insects.sort(new InsectByNameCamporator());
            } default: {
                insects.sort(new InsectByNameCamporator());
                break;
            }
        }
        for (Insect in: insects){
            System.out.println(in);
        }
    }
}