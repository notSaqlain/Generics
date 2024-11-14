
import java.util.*;
import javax.sound.sampled.SourceDataLine;

public class Main {
    Coppia c1 = new Coppia<String, Integer>("Saqlain", 1);
    Coppia c2 = new Coppia<Double, Long>(3.14, 500l);

    System.out.println(c1);
    System.out.println(c2);

}
