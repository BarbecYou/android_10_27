package hu.petrik.androidgyak1;

public class Ember {
    private String nev;
    private int eletkor;

    public Ember(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }
}
