
public class riga{
    private String nome;
    private String cose;
    private String cat_3;
    private String cat_4;

    public riga(String nome, String cose, String citta, String frutta) {
        this.nome = nome;
        this.cose = cose;
        this.cat_3 = citta;
        this.cat_4 = frutta;
    }

    public String getNome() {
        return nome;
    }

    public String getCose() {
        return cose;
    }

    public String getcat_3() {
        return cat_3;
    }

     public String getcat_4() {
        return cat_4;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCose(String cose) {
        this.cose = cose;
    }

    public void setcat_3(String citta) {
        this.cat_3 = citta;
    }

    public void setcat_4(String frutta) {
        this.cat_4 = frutta;
    }

    @Override
    public String toString() {
        return "riga{" +
                "nome=" + nome +
                ", cose='" + cose + '\'' +
                ", citta='" + cat_3 + '\'' +
                ", frutta='" + cat_4 + '\'' +
                '}';
    }
}

