
public class riga{
<<<<<<< Updated upstream
    private String nome;
    private String cose;
    private String cat_3;
    private String cat_4;

    public riga(String nome, String cose, String citta, String frutta) {
        this.nome = nome;
        this.cose = cose;
        this.cat_3 = citta;
        this.cat_4 = frutta;
=======
    private String cat1;
    private String cat2;
    private String citta;
    private String frutta;

    public riga(String cat1, String cat2, String citta, String frutta) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.citta = citta;
        this.frutta = frutta;
>>>>>>> Stashed changes
    }

    public String getCat1() {
        return cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public String getcat_3() {
        return cat_3;
    }

     public String getcat_4() {
        return cat_4;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
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
<<<<<<< Updated upstream
                "nome=" + nome +
                ", cose='" + cose + '\'' +
                ", citta='" + cat_3 + '\'' +
                ", frutta='" + cat_4 + '\'' +
=======
                "nome=" + cat1 +
                ", cose='" + cat2 + '\'' +
                ", citta='" + citta + '\'' +
                ", frutta='" + frutta + '\'' +
>>>>>>> Stashed changes
                '}';
    }
}

