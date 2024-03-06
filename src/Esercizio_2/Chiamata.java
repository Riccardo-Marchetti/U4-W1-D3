package Esercizio_2;

public class Chiamata {
   private int durata;
   private int numero;

public Chiamata(int durata, int numero) {
    this.durata = durata;
    this.numero = numero;
}

    public int getDurata() {
        return durata;
    }

    public int getNumero() {
        return numero;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durata=" + durata +
                ", numero=" + numero +
                '}';
    }
}
