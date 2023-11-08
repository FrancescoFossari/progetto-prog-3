
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class WordSearchGame {
    public static void main(String[] args) {
        // Elenco di file da cercare
        List<String> files = new ArrayList<>();
        files.add("dizionario/nomi.txt");
        files.add("dizionario/cose.txt");
        files.add("dizionario/citta.txt");
        files.add("dizionario/animali.txt");
        files.add("dizionario/cantanti.txt");
        files.add("dizionario/mestieri.txt");
        
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
