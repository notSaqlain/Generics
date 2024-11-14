

public class Main {
    public static void main(String[] args) {
        Coppia c1 = new Coppia<String, Integer>("Saqlain", 1);
        Coppia c2 = new Coppia<Double, Long>(3.14, 500l);

        System.out.println(c1);
        System.out.println(c2);
    }

}
