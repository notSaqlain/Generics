package Sanremo;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // Lista per memorizzare i partecipanti
        ArrayList<String> partecipanti = new ArrayList<>();

        // Percorso relativo al file CSV
        String filePath = "data/partecipantiSanremo.csv";

        // Lettura e caricamento nell'ArrayList
        try {
            java.io.File file = new java.io.File(filePath);
            java.util.Scanner scanner = new java.util.Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                partecipanti.add(line); // Aggiunge la riga all'ArrayList
            }

            scanner.close();

            // Stampa l'elenco dei partecipanti
            System.out.println("Elenco dei partecipanti al Festival di Sanremo 2024:");
            for (String partecipante : partecipanti) {
                System.out.println(partecipante);
            }
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante la lettura del file: " + e.getMessage());
        }
    }
}