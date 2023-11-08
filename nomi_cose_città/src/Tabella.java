
public class Tabella {
    private String nome;
    private String cosa;
    private String citta;
    private String frutta;

    Tabella(Builder builder) {
        this.nome = builder.nome;
        this.cosa = builder.cosa;
        this.citta = builder.citta;
         this.frutta = builder.frutta;
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



