
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Coppia c1 = new Coppia<String, Integer>("Saqlain", 1);
        Coppia c2 = new Coppia<Double, Long>(3.14, 500l);

        ArrayList<Double> v = new ArrayList<>();
        v.add(3.14);
        v.add((double)43);

        System.out.println(v);
        System.out.println(c1);
        System.out.println(c2);
    }

}
