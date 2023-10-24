
public class riga{
    private String nome;
    private String cose;
    private String citta;

    public riga(String nome, String cose, String citta) {
        this.nome = nome;
        this.cose = cose;
        this.citta = citta;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCose(String cose) {
        this.cose = cose;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "riga{" +
                "nome=" + nome +
                ", type='" + cose + '\'' +
                ", name='" + citta + '\'' +
                '}';
    }
}

