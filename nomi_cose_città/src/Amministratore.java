import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Amministratore {
    private static final int NUMERO_CATEGORIE_DA_SCEGLIERE = 3;
    private static List<String> categorieScelte;
    
    public Amministratore() {
        // Inizializza tutte le categorie disponibili
        List<String> categorieDisponibili = new ArrayList<>();
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
        
        categorieScelte = scegliCategorie(categorieDisponibili, NUMERO_CATEGORIE_DA_SCEGLIERE);
    }

    // Scegli casualmente le categorie da un elenco
    private List<String> scegliCategorie(List<String> categorieDisponibili, int numeroCategorie) {
        if (categorieDisponibili.size() < numeroCategorie) {
            System.out.println("Non ci sono abbastanza categorie disponibili.");
            return null;
        }
        
        Random random = new Random();
        List<String> categorieScelte = new ArrayList<>();
        
        for (int i = 0; i < numeroCategorie; i++) {
            int indiceCasuale = random.nextInt(categorieDisponibili.size());
            String categoriaScelta = categorieDisponibili.get(indiceCasuale);
            categorieScelte.add(categoriaScelta);
            categorieDisponibili.remove(indiceCasuale);
        }

        return categorieScelte;
    }

    // Restituisce le categorie scelte dall'amministratore
    public List<String> getCategorieScelte() {
        return categorieScelte;
    }

    public void avviaGioco(int numGiocatori) {
        List<Thread> giocatoriThreads = new ArrayList<>();
        List<String> categorieGiocatore = categorieScelte;

        if (categorieGiocatore == null) {
            System.out.println("Impossibile avviare il gioco senza categorie sufficienti.");
            return;
        }

        for (int i = 1; i <= numGiocatori; i++) {
            String nomeGiocatore = "Giocatore " + i;
            
            Runnable giocatore = new Giocatore(nomeGiocatore, categorieGiocatore, this);
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
        riga rigaOggetto = new riga(null, null, null, null);

       String[] CSarray = categorieScelte.toArray(new String[categorieScelte.size()]);

for (int i = 0; i < NUMERO_CATEGORIE_DA_SCEGLIERE; i++) {
    switch (i) {
        case 0:
            rigaOggetto.setCat1(CSarray[i]);
            break;
        case 1:
            rigaOggetto.setCat2(CSarray[i]);
            break;
        case 2:
            rigaOggetto.setCat3(CSarray[i]);
            break;
        case 3:
            rigaOggetto.setCat4(CSarray[i]);
            break;
        default:
           
            break;
    }

    for (int j = 0; j < NUMERO_CATEGORIE_DA_SCEGLIERE; j++) {
         System.out.println(CSarray);
    }
}

       
        System.out.println("Categorie scelte dall'amministratore:");
        for (String categoria : amministratore.getCategorieScelte()) {
            System.out.println(categoria);
        }

        amministratore.avviaGioco(3); 
    }
}

class Giocatore implements Runnable {
    private String nome;
    private List<String> categorie;
    private Amministratore amministratore;

    public Giocatore(String nome, List<String> categorie, Amministratore amministratore) {
        this.nome = nome;
        this.categorie = categorie;
        this.amministratore = amministratore;
    }

    @Override
    public void run() {
        // Utilizza le categorie scelte dall'amministratore
        for (String categoria : categorie) {
            // Puoi fare quello che vuoi con la categoria scelta
            System.out.println(nome + " ha scelto la categoria: " + categoria);
        }
    }
}
