import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Amministratore {
    private static final int NUMERO_CATEGORIE_DA_SCEGLIERE = 5;
    private static final List<String> TUTTE_LE_CATEGORIE = new ArrayList<>();
    private List<Giocatore> giocatoriConnessi=new ArrayList<>();
    private ServerSocket serverSocket;

    public Amministratore(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server avviato sulla porta " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void accettaGiocatori() {
        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nuovo giocatore connesso: " + clientSocket.getInetAddress());
                GiocatoreClientHandler clientHandler = new GiocatoreClientHandler(clientSocket, this);
                giocatoriConnessi.add(clientHandler);
                Thread thread = new Thread(clientHandler);
                thread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Amministratore() {
        // Inizializza tutte le categorie disponibili
        TUTTE_LE_CATEGORIE.add("Nomi di persona");
        TUTTE_LE_CATEGORIE.add("Cose (oggetti)");
        TUTTE_LE_CATEGORIE.add("Città");
        TUTTE_LE_CATEGORIE.add("Verbi");
        TUTTE_LE_CATEGORIE.add("Animali");
        TUTTE_LE_CATEGORIE.add("Frutta");
        TUTTE_LE_CATEGORIE.add("Fiori e Piante");
        TUTTE_LE_CATEGORIE.add("Cantanti");
        TUTTE_LE_CATEGORIE.add("Nazioni");
        TUTTE_LE_CATEGORIE.add("Mestieri");
        TUTTE_LE_CATEGORIE.add("Personaggi famosi o storici");
    }
    
    // Scegli casualmente cinque categorie
    public List<String> scegliCategorie() {
        List<String> categorieScelte = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < NUMERO_CATEGORIE_DA_SCEGLIERE; i++) {
            int indiceCasuale = random.nextInt(TUTTE_LE_CATEGORIE.size());
            String categoriaScelta = TUTTE_LE_CATEGORIE.remove(indiceCasuale);
            categorieScelte.add(categoriaScelta);
        }
        
        return categorieScelte;
    }

    public static void main(String[] args) {
        int port = 12345;
        Amministratore amministratore = new Amministratore();
        List<String> categorieScelte = amministratore.scegliCategorie();
        
        // Passa le categorie scelte a una funzione griglia o inviale ai client
        System.out.println("Categorie scelte dall'amministratore:");
        for (String categoria : categorieScelte) {
            System.out.println(categoria);
        }

    

        

    }
}
