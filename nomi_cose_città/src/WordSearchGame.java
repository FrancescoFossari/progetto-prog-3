import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Interfaccia per la strategia di ricerca
interface SearchStrategy {
    boolean search(String word, List<String> files);
}

// Implementazione della strategia di ricerca sequenziale nei file
class SequentialFileSearchStrategy implements SearchStrategy {
    @Override
    public boolean search(String word, List<String> files) {
        for (String filePath : files) {
            if (searchInFile(word, filePath)) {
                return true; // Parola trovata in uno dei file
            }
        }
        return false; // Parola non trovata nei file
    }

    private boolean searchInFile(String word, String filePath) {
        word = word.toLowerCase(); // Converti la parola da cercare in lettere minuscole
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase(); // Converti la riga in lettere minuscole
                if (line.contains(word)) {
                    return true; // Parola trovata nel file
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Parola non trovata nel file
    }
}

public class WordSearchGame {
    public static void main(String[] args) {
        // Elenco di file da cercare
        List<String> files = new ArrayList<>();
        files.add("nomi.txt");
        files.add("cose.txt");
        files.add("citta.txt");
        files.add("animali.txt");
        files.add("cantanti.txt");
        files.add("mestieri.txt");
        
        // Crea strategia di ricerca sequenziale
        SearchStrategy fileSearchStrategy = new SequentialFileSearchStrategy();

        // Richiedi la parola da cercare all'utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la parola da cercare: ");
        String parolaDaCercare = scanner.nextLine();
        scanner.close();

        boolean isParolaTrovata = fileSearchStrategy.search(parolaDaCercare, files);

        if (isParolaTrovata) {
            System.out.println("Parola trovata: " + parolaDaCercare);
        } else {
            System.out.println("Parola non trovata: " + parolaDaCercare);
        }
    }
}
