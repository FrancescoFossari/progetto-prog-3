import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Giocatore{
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public Giocatore(String serverAddress, int serverPort) {
        try {
            socket = new Socket(serverAddress, serverPort);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void partecipaAlGioco(String nome, String cognome) {
        output.println(nome+" "+cognome+"join the game");
    }

    public void inviaParola(String categoria, String parola) {
        output.println("WORD " + categoria + " " + parola);
    }

    public void chiudiConnessione() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String serverAddress = "localhost"; // Indirizzo IP o nome del server
        int serverPort = 12345; // Porta del server

        Giocatore player = new Giocatore(serverAddress, serverPort);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci nome e cognome del giocatore");
        String nome = scanner.next();
        String cognome=scanner.next();
        // Sostituisci "Nome" e "Cognome" con i dati del giocatore
        player.partecipaAlGioco(nome,cognome);

        System.out.print("Scrivi una parola della categoria");
        String parola = scanner.next();
        // Esempio di invio di una parola per una categoria
        player.inviaParola("Nomi", parola);

    
        scanner.close();
        // Chiudi la connessione quando hai finito
        player.chiudiConnessione();
    }
}
