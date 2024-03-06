package Esercizio_3;

public class Articolo {

    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int numPezzi;

    public Articolo(int codiceArticolo, String descrizioneArticolo, int prezzo, int numPezzi) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numPezzi = numPezzi;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumPezzi() {
        return numPezzi;
    }

    public void setNumPezzi(int numPezzi) {
        this.numPezzi = numPezzi;
    }
}
