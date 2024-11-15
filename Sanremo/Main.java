package Sanremo;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<String> partecipanti = new ArrayList<>();
        String filePath = "Sanremo/Sanremo.csv";

        try {
            java.io.File file = new java.io.File(filePath);
            java.util.Scanner scanner = new java.util.Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                partecipanti.add(line);
            }

            scanner.close();

            System.out.println("Elenco dei partecipanti: ");
            for (String partecipante : partecipanti) {
                System.out.println(partecipante);
            }
        } catch (Exception e) {
            System.out.println("FILE ERROR: " + e.getMessage());
        }
    }
}