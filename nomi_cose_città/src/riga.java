
public class riga{
    private String cat1;
    private String cat2;
    private String cat3;
    private String cat4;

    public riga(String cat1, String cat2, String cat3, String cat4) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.cat3 = cat3;
        this.cat4 = cat4;
    }

    public String getCat1() {
        return cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public String getCat3() {
        return cat3;
    }

     public String getCat4() {
        return cat4;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    public void setCat4(String cat4) {
        this.cat4 = cat4;
    }

    @Override
    public String toString() {
        return "riga{" +
                "nome=" + cat1 +
                ", cose='" + cat2 + '\'' +
                ", citta='" + cat3 + '\'' +
                ", frutta='" + cat4 + '\'' +
                '}';
    }
}

