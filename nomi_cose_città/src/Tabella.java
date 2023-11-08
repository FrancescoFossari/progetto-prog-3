
public class Tabella {
    private int tot;
    private String nome;
    private String cosa;
    private String citta;
    private String frutta;

    Tabella(Builder builder) {
        this.tot = builder.tot;
        this.nome = builder.nome;
        this.cosa = builder.cosa;
        this.citta = builder.citta;
        this.frutta = builder.frutta;
    }

    public int getTot() {
        return tot;
    }

    public String getNome() {
        return nome;
    }

    public String getCosa() {
        return cosa;
    }

    public String getCitta() {
        return citta;
    }

    public String getFrutta() {
        return frutta;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCosa(String cosa) {
        this.cosa = cosa;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setFrutta(String frutta) {
        this.frutta = frutta;
    }


}



