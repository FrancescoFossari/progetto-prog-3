import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Amministratore {
    private static final int NUMERO_CATEGORIE_DA_SCEGLIERE = 5;
    private List<String> categorieDisponibili;
    
    public Amministratore() {
        // Inizializza tutte le categorie disponibili
        categorieDisponibili = new ArrayList<>();
        categorieDisponibili.add("Nomi di persona");
        categorieDisponibili.add("Cose (oggetti)");
        categorieDisponibili.add("Città");
        categorieDisponibili.add("Verbi");
        categorieDisponibili.add("Animali");
        categorieDisponibili.add("Frutta");
        categorieDisponibili.add("Fiori e Piante");
        categorieDisponibili.add("Cantanti");
        categorieDisponibili.add("Nazioni");
        categorieDisponibili.add("Mestieri");
        categorieDisponibili.add("Personaggi famosi o storici");
    }

    // Scegli casualmente cinque categorie
    public List<String> scegliCategorie() {
        if (categorieDisponibili.size() < NUMERO_CATEGORIE_DA_SCEGLIERE) {
            System.out.println("Non ci sono abbastanza categorie disponibili.");
            return null;
        }
        
        Random random = new Random();
        List<String> categorieScelte = new ArrayList<>();
        
        for (int i = 0; i < NUMERO_CATEGORIE_DA_SCEGLIERE; i++) {
            int indiceCasuale = random.nextInt(categorieDisponibili.size());
            String categoriaScelta = categorieDisponibili.get(indiceCasuale);
            categorieScelte.add(categoriaScelta);
            categorieDisponibili.remove(indiceCasuale);
        }

        return categorieScelte;
    }

    public void avviaGioco(int numGiocatori) {
        List<Thread> giocatoriThreads = new ArrayList<>();
        List<String> categorieGiocatore = scegliCategorie();

        if (categorieGiocatore == null) {
            System.out.println("Impossibile avviare il gioco senza categorie sufficienti.");
            return;
        }

        for (int i = 1; i <= numGiocatori; i++) {
            String nomeGiocatore = "Giocatore " + i;
            
            Runnable giocatore = new Giocatore(nomeGiocatore, categorieGiocatore);
            Thread threadGiocatore = new Thread(giocatore);
            giocatoriThreads.add(threadGiocatore);
            threadGiocatore.start();
        }

        for (Thread thread : giocatoriThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {   
        Amministratore amministratore = new Amministratore();
        amministratore.avviaGioco(3); // Specifica il numero di giocatori
    }
}

class Giocatore implements Runnable {
    private String nome;
    private List<String> categorie;

    public Giocatore(String nome, List<String> categorie) {
        this.nome = nome;
        this.categorie = categorie;
    }

    @Override
    public void run() {
        // Implementa il comportamento del giocatore durante il gioco
        for (String categoria : categorie) {
            // Puoi fare quello che vuoi con la categoria scelta
            System.out.println(nome + " ha scelto la categoria: " + categoria);
        }
    }
}
