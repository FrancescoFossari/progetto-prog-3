
public class riga{
    private String nome;
    private String cose;
    private String citta;
    private String frutta;

    public riga(String nome, String cose, String citta, String frutta) {
        this.nome = nome;
        this.cose = cose;
        this.citta = citta;
        this.frutta = frutta;
    }

    public String getNome() {
        return nome;
    }

    public String getCose() {
        return cose;
    }

    public String getCitta() {
        return citta;
    }

     public String getFrutta() {
        return frutta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCose(String cose) {
        this.cose = cose;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setFrutta(String frutta) {
        this.frutta = frutta;
    }

    @Override
    public String toString() {
        return "riga{" +
                "nome=" + nome +
                ", cose='" + cose + '\'' +
                ", citta='" + citta + '\'' +
                ", frutta='" + frutta + '\'' +
                '}';
    }
}

